/**
Copyright 2014 Miyuru Dayarathna

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package org.streamfarm.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.streamfarm.Farmer;
import org.streamfarm.comm.FarmManagerProtocol;
import org.streamfarm.db.FarmManagerDBComm;
import org.streamfarm.events.FarmShutdownEvent;
import org.streamfarm.events.FarmShutdownEventListener;
import org.streamfarm.events.ManagerPokeEvent;
import org.streamfarm.events.ManagerPokeEventListener;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

import org.streamfarm.utils.Conts;

/**
 * @author miyuru
 *
 */
public class FarmManager implements Farmer{
	//attributes
	private Dictionary<String, String[]> springRegistry;
	private ServerSocket srv;
	private boolean isLive;
	private FarmManagerDBComm db;
	private PerfMonitorTimer timer;

	public FarmManager(){
		isLive = true;
		db = new FarmManagerDBComm();
		db.initFarmManagerDB(); //Do only once
	}
	
	/**
	 * 
	 */
	public void run() {
		timer = new PerfMonitorTimer();
		timer.addPokeEventListener(new FarmManagerPokeEventListener(this));
		Thread timerThread = new Thread(timer);
		timerThread.start();
		
		try {
			srv = new ServerSocket(Conts.FARM_MANAGER_PORT);
			createWorkers();
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("StreamFarm Started.");
			
			while(true){
				Socket socket = srv.accept();
				ManagerServiceSession session = new ManagerServiceSession(socket);
				session.addShutdownEventListener(new FarmManagerShutdownEventListener(this));
				session.start();
			}
			
		}catch(BindException e){
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nThere is already a running FarmManager instance on this host.");
			System.exit(-1);
		}catch(SocketException e){
			if (isLive){
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nThere is already a running FarmManager instance on this host.");
			}
		}
		catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}

	/**
	 * 
	 */
	private void createWorkers() {
		
		try {
			ArrayList<String> hosts = Utils.getHostsList();
			Process proc1 = null;
			BufferedReader procOut = null;
			String line = "", res = "";
			Properties prop = new Properties();
			prop.load(new FileInputStream(Conts.FARM_CONFIG_FILE));
			String heapmin = prop.getProperty("workerHeapMin");
			String heapmax = prop.getProperty("workerHeapMax");

			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Worker min heap : " + heapmin);
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Worker max heap : " + heapmax);
			
			for (String host:hosts){
				proc1 = Runtime.getRuntime().exec(new String[]{"ssh",host,"netstat","-anp", "|", "grep", ":" + Conts.FARM_WORKER_PORT});
				procOut = new BufferedReader(new InputStreamReader(proc1.getInputStream()));
				line = "";
				res = "";
				
				while((line = procOut.readLine()) != null){
					res += line;
				}

				if (res.contains(":" + Conts.FARM_WORKER_PORT) && res.contains("LISTEN")){
					String[] items = res.split(" ");
					String pid = items[items.length - 1].split("/")[0];
					proc1 = Runtime.getRuntime().exec(new String[]{"ssh",host,"kill",pid});
					procOut = new BufferedReader(new InputStreamReader(proc1.getInputStream()));
					line = "";
					res = "";
					
					while((line = procOut.readLine()) != null){
						res += line;
					}
					
					if (res != ""){
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Cannot kill the FarmWorker process at host : " + host);
					}else{
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Removed and existing FarmWorker instance on host : " + host);
					}
				}				
					
					Runtime.getRuntime().exec(new String[]{"ssh",host,"java",heapmin, heapmax,"-cp", Conts.APP_DIR + ":" + Conts.APP_DIR + "/log4j-1.2.16.jar", "RunWorker"});
					Thread.sleep(Conts.WORKER_INIT_TIME);
					
					//Send initial message and see whether the worker is ready
					Socket skt = new Socket(host, Conts.FARM_WORKER_PORT);
					PrintWriter out = new PrintWriter(skt.getOutputStream());
					BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
					
					out.println(FarmManagerProtocol.READY);
					out.flush();
					String response = reader.readLine();
					
					if (response.equals(FarmManagerProtocol.OK)){
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("FarmWorker instantiated successfully on host : " + host);
						out.println(FarmManagerProtocol.CLOSE);
						out.flush();
					}else{
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Cannot instantiate FarmWorker on host : " + host);	
					}
			}
			
		} catch (FileNotFoundException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		} catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	private void shutdownWorkers() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(Conts.FARM_CONFIG_FILE));
			String[] hosts = prop.getProperty("hosts").split(",");
			String line = "";
			
			for (String host:hosts){
				try {
					Socket skt = new Socket(host, Conts.FARM_WORKER_PORT);
					PrintWriter out = new PrintWriter(skt.getOutputStream());
					BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
					
					line = "";
						
					out.println(FarmManagerProtocol.SHUTDOWN);
					out.flush();
					line=in.readLine();
				
					if (line.equals(FarmManagerProtocol.SHUTDOWN_ACK)){
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Shutdowned FarmWorker on host : " + host);
					}else{
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Cannot shutdown the FarmWorker process at host : " + host);
					}
					
				} catch (UnknownHostException e) {
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				} catch (IOException e) {
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				}
			}
			
		} catch (FileNotFoundException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		} catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}		
	}
	

	/**
	 * This method is called for shutting down the farm
	 */
	public void shutdown() {
		isLive = false;
		timer.close();
		shutdownWorkers();
		try {
			srv.close();
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Exitting FarmManager.");
		} catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}

	/**
	 * This method is periodically called by the FarmManager to gather performance information (E.g. Data rate of Springs, Sinkholes)
	 */
	public void updatePerfInfo() {
		FarmManagerDBComm dbCon = new FarmManagerDBComm();
		Connection con = dbCon.getDBConnection();
			
		Statement stmt;
		
		try {
			stmt = con.createStatement();
			
			//For Springs
			ResultSet rs = stmt.executeQuery("SELECT host FROM spring");
			
	    	while(rs.next()){
	    		String host = rs.getString(1);
	    		
				Socket skt;

					skt = new Socket(host, Conts.FARM_WORKER_PORT);

					PrintWriter out = new PrintWriter(skt.getOutputStream());
					BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				
					out.println(FarmManagerProtocol.DATA_RATE_FULL_SPRING);
					out.flush();
					String response = reader.readLine();
					response = response.substring(1, response.length() - 1);
					
					if(response.length() == 0){
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("No perf info");
						return;
					}
					
					String[] result = response.split("-");
					
					for(int i = 0; i < result.length; i++){
						String[] springDesc = result[i].split(":");
						i += 1; //Just move the pointer to the perf value
						stmt = con.createStatement();
						stmt.executeUpdate("UPDATE spring SET datarate = " + result[i] + " WHERE host LIKE '" + host + "' AND port=" + springDesc[1] + " and type LIKE '" + springDesc[0] + "';" );
					}
					
					//Close the socket
					skt.close();
					
				}

					stmt = con.createStatement();
					
					//For Sinks
					rs = stmt.executeQuery("SELECT host FROM sinkhole;");
					
			    	while(rs.next()){
			    		String host = rs.getString(1);
			    		
							Socket skt = new Socket(host, Conts.FARM_WORKER_PORT);

							PrintWriter out = new PrintWriter(skt.getOutputStream());
							BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
						
							out.println(FarmManagerProtocol.DATA_RATE_FULL_SINKHOLE);
							out.flush();
							String response = reader.readLine();
							response = response.substring(1, response.length() - 1);
							
							if(response.length() == 0){
								Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("No perf info");
								return;
							}
							
							String[] result = response.split("-");
							
							for(int i = 0; i < result.length; i++){
								String[] sinkholeDesc = result[i].split(":");
								i += 1; //Just move the pointer to the perf value
								stmt = con.createStatement();
								stmt.executeUpdate("UPDATE sinkhole SET datarate = " + result[i] + " WHERE host LIKE '" + host + "' AND port=" + sinkholeDesc[1] + " and type LIKE '" + sinkholeDesc[0] + "';" );
							}
							
							//Close the socket
							skt.close();
						}
					
					
		}catch(SocketException ec){
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + ec.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(ec));
		} catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));	    		
		} catch (SQLException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}
	
}


class FarmManagerShutdownEventListener implements FarmShutdownEventListener{
	private Farmer farmer;
	
	public FarmManagerShutdownEventListener(Farmer farmer){
		this.farmer = farmer;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.manager.FarmShutdownEventListener#shutdownEventOccurred(org.streamfarm.manager.FarmShutdownEvent)
	 */
	@Override
	public void shutdownEventOccurred(FarmShutdownEvent evt) {
		farmer.shutdown();
	}	
}

class FarmManagerPokeEventListener implements ManagerPokeEventListener{
	private FarmManager manager;
	
	public FarmManagerPokeEventListener(FarmManager ref){
		this.manager = ref;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.ManagerPokeEventListener#perfPokeEventOccurred(org.streamfarm.events.ManagerPokeEvent)
	 */
	@Override
	public void perfPokeEventOccurred(ManagerPokeEvent evt) {
		manager.updatePerfInfo();
	}	
}