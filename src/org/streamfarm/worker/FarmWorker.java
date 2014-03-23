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
package org.streamfarm.worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.streamfarm.Farmer;
import org.streamfarm.FileSpringTCP;
import org.streamfarm.FileSpringUDP;
import org.streamfarm.Sinkhole;
import org.streamfarm.SinkholeTCP;
import org.streamfarm.SinkholeUDP;
import org.streamfarm.Spring;
import org.streamfarm.comm.ConnectionStateProtocol;
import org.streamfarm.events.FarmShutdownEvent;
import org.streamfarm.events.FarmShutdownEventListener;
import org.streamfarm.events.SinkholeCreationEvent;
import org.streamfarm.events.SinkholeCreationEventListener;
import org.streamfarm.events.SinkholeDeletionEvent;
import org.streamfarm.events.SinkholeDeletionEventListener;
import org.streamfarm.events.SpringConnectedEvent;
import org.streamfarm.events.SpringConnectedEventListener;
import org.streamfarm.events.SpringCreationEvent;
import org.streamfarm.events.SpringCreationEventListener;
import org.streamfarm.events.SpringDeletionEvent;
import org.streamfarm.events.SpringDeletionEventListener;
import org.streamfarm.events.WorkerPokeEvent;
import org.streamfarm.events.WorkerPokeEventListener;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class FarmWorker implements Farmer{
	private boolean isLive;
	private ServerSocket srv;
	private HashMap<String, ArrayList<Spring>> springsMap; //The Map that holds Springs
	private HashMap<String, ArrayList<Sinkhole>> sinkholesMap; //The Map that holds Sinkholes
	private String flowerBedState;
	private String stateHash;
	private ArrayList<WorkerServiceSession> workerSessions;
	private FlowerBedCheckupTimer timer;
	private PerfRegistry perfRegistry;
	
	
	public FarmWorker(){
		isLive = true;
		springsMap = new HashMap<String, ArrayList<Spring>>();
		sinkholesMap = new HashMap<String, ArrayList<Sinkhole>>();
		workerSessions = new ArrayList<WorkerServiceSession>(); 
		perfRegistry = new PerfRegistry();
	}
	
	/**
	 * 
	 */
	public void run() {
				BasicConfigurator.configure();
				//Start the flowerbed checkup timer. This timer is used to check the status of the
				//flowerbed (Springs, Sinkholes)
				timer = new FlowerBedCheckupTimer();
				timer.addPokeEventListener(new FarmWorkerPokeEventListener(this));
				Thread timerThread = new Thread(timer);
				timerThread.start();
				
				try {
							srv = new ServerSocket(Conts.FARM_WORKER_PORT);
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Worker started.");
							
							while(true){
								Socket socket = srv.accept();
								WorkerServiceSession session = new WorkerServiceSession(socket, this.perfRegistry);
								session.addShutdownEventListener(new FarmWorkerShutdownEventListener(this));
								session.addSpringCreationEventListener(new FarmWorkerSpringCreationEventListener(this));
								session.addSinkholeCreationEventListener(new FarmWorkerSinkholeCreationEventListener(this));
								session.addSpringDeletionEventListener(new FarmWorkerSpringDeletionEventListener(this));
								session.start();
								workerSessions.add(session);
							}
						}catch(BindException e){
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nThere is already a running FarmWorker instance on this host.");
							System.exit(-1);
						}catch(SocketException e){
							if (isLive){
								Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nThere is already a running FarmWorker instance on this host.");
							}
						}
						catch (IOException e) {
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
						}

	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Farmer#shutdown()
	 */
	@Override
	public void shutdown() {
		isLive = false;
		//First shutdown the monitoring thread
		timer.close();
		
		for (Entry<String, ArrayList<Spring>> mapEntry : springsMap.entrySet()){
			ArrayList<Spring> springs  = mapEntry.getValue();
			
			for(Spring sp : springs){
				sp.close();
			}
		}
		
		for (Entry<String, ArrayList<Sinkhole>> mapEntry : sinkholesMap.entrySet()){
			ArrayList<Sinkhole> sinkholes  = mapEntry.getValue();
			
			for(Sinkhole sh : sinkholes){
				sh.close();
			}
		}
		
		try {
			srv.close();
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Exitting FarmWorker.");
		} catch (IOException e) {
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}

	/**
	 * @param spring
	 */
	public void addSpring(Spring spring) {

		//For UDP Springs
		if(spring.getClass().equals(FileSpringUDP.class)){
			if (springsMap.containsKey(FileSpringUDP.class.toString())){
				ArrayList<Spring> obj = springsMap.get(FileSpringUDP.class.toString());
				obj.add(spring);
			}else{
				ArrayList<Spring> obj = new ArrayList<Spring>();
				obj.add(spring);
				springsMap.put(FileSpringUDP.class.toString(), obj);
			}
		} else if(spring.getClass().equals(FileSpringTCP.class)){
			if (springsMap.containsKey(FileSpringTCP.class.toString())){
				ArrayList<Spring> obj = springsMap.get(FileSpringTCP.class.toString());
				obj.add(spring);
			}else{
				ArrayList<Spring> obj = new ArrayList<Spring>();
				obj.add(spring);
				springsMap.put(FileSpringTCP.class.toString(), obj);
			}
		}
	}

	/**
	 * @param sinkhole
	 */
	public void addSinkhole(Sinkhole sinkhole) {
		//For UDP Springs
		if(sinkhole.getClass().equals(SinkholeUDP.class)){
			if (sinkholesMap.containsKey(SinkholeUDP.class.toString())){
				ArrayList<Sinkhole> obj = sinkholesMap.get(SinkholeUDP.class.toString());
				obj.add(sinkhole);
			}else{
				ArrayList<Sinkhole> obj = new ArrayList<Sinkhole>();
				obj.add(sinkhole);
				sinkholesMap.put(SinkholeUDP.class.toString(), obj);
			}
		} else if(sinkhole.getClass().equals(SinkholeTCP.class)){
			if (sinkholesMap.containsKey(SinkholeTCP.class.toString())){
				ArrayList<Sinkhole> obj = sinkholesMap.get(SinkholeTCP.class.toString());
				obj.add(sinkhole);
			}else{
				ArrayList<Sinkhole> obj = new ArrayList<Sinkhole>();
				obj.add(sinkhole);
				sinkholesMap.put(SinkholeTCP.class.toString(), obj);
			}
		}
	}

	/**
	 * @param protocol
	 * @param host
	 * @param port
	 */
	public void recordAsConnected(String protocol, String host, int port) {
		if(protocol.equals("TCP")){
			flowerBedState += ConnectionStateProtocol.CONNECTED + ConnectionStateProtocol.TCP + host + ConnectionStateProtocol.FILED_DELIM + port;
		}else if(protocol.equals("UDP")){
			flowerBedState += ConnectionStateProtocol.CONNECTED + ConnectionStateProtocol.UDP + host + ConnectionStateProtocol.FILED_DELIM + port;
		}
		
		updateWorkerSessionSatetes();
	}

	/**
	 * @param flowerBedState2
	 */
	private void updateWorkerSessionSatetes() {
		for(WorkerServiceSession session: workerSessions){
			session.updateState(flowerBedState);
		}
		
		flowerBedState = ""; //Just clear the state on the farm worker
	}

	/**
	 * This method deletes all the Springs associated with the Worker
	 */
	public void deleteAllSprings() {
		for (Entry<String, ArrayList<Spring>> mapEntry : springsMap.entrySet()){
			ArrayList<Spring> springs  = mapEntry.getValue();
			
			for(Spring sp : springs){
				sp.close();
			}
		}
	}	
	
	/**
	 * A polymorphic version of the public void deleteAllSprings()
	 * @param protocol The type of the Springs to be deleted 
	 */
	public void deleteAllSprings(String protocol) {
		for (Entry<String, ArrayList<Spring>> mapEntry : springsMap.entrySet()){
			ArrayList<Spring> springs  = mapEntry.getValue();
			String springType = mapEntry.getKey();
			
			for(Spring sp : springs){
				if (sp.getProtocol().equals(protocol)){
					int port = sp.getPort();
					sp.close();
				}
			}
		}
	}

	/**
	 * This method deletes all the Sinkholes associated with the Worker
	 */
	public void deleteAllSinkholes() {
		for (Entry<String, ArrayList<Sinkhole>> mapEntry : sinkholesMap.entrySet()){
			ArrayList<Sinkhole> sinkholes  = mapEntry.getValue();
			
			for(Sinkhole sh : sinkholes){
				sh.close();
			}
		}		
	}

	/**
	 * The polymorphic version of the deleteAllSinkholes() method
	 * @param protocol
	 */
	public void deleteAllSinkholes(String protocol) {
		for (Entry<String, ArrayList<Sinkhole>> mapEntry : sinkholesMap.entrySet()){
			ArrayList<Sinkhole> springs  = mapEntry.getValue();
			
			for(Sinkhole sh : springs){
				if (sh.getProtocol().equals(protocol)){
					sh.close();
				}
			}
		}
	}

	/**
	 * This method gathers the data rate from springs
	 */
	public void updateSpringsDataRate() {
		HashMap<String, Double> springsDataRateMap = new HashMap<String, Double>();
		
		for (Entry<String, ArrayList<Spring>> mapEntry : springsMap.entrySet()){
			ArrayList<Spring> springs  = mapEntry.getValue();
						
			for(Spring sp : springs){
				double byteCount = sp.getDataRate();
				String springProt = sp.getProtocol();
				String springKey = springProt + ":" + sp.getPort();
				
				springsDataRateMap.put(springKey, byteCount);
			}
		}
		
		perfRegistry.springsDataRateMap = springsDataRateMap;
	}

	/**
	 * This method updates the datarates of sinkholes
	 */
	public void updateSinkholesDataRate() {
		HashMap<String, Double> sinkholesDataRateMap = new HashMap<String, Double>();
		
		for (Entry<String, ArrayList<Sinkhole>> mapEntry : sinkholesMap.entrySet()){
			ArrayList<Sinkhole> sinkholes  = mapEntry.getValue();
						
			for(Sinkhole sh : sinkholes){
				Double byteCount = sh.getDataRate();
				String sinkholeProt = sh.getProtocol();
				String sinkholeKey = sinkholeProt + ":" + sh.getPort();
				
				sinkholesDataRateMap.put(sinkholeKey, byteCount);
			}
		}
		
		perfRegistry.sinkholesDataRateMap = sinkholesDataRateMap;
	}
	
}

class FarmWorkerShutdownEventListener implements FarmShutdownEventListener{
	private Farmer farmer;
	
	public FarmWorkerShutdownEventListener(Farmer farmer){
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

class FarmWorkerSpringCreationEventListener implements SpringCreationEventListener{
	private FarmWorker worker;
	
	public FarmWorkerSpringCreationEventListener(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.SpringCreationEventListener#springCreationEventOccurred(org.streamfarm.events.SpringCreationEvent)
	 */
	@Override
	public void springCreationEventOccurred(SpringCreationEvent evt) {
		this.worker.addSpring(evt.getSpring());
	}	
}

class FarmWorkerSinkholeCreationEventListener implements SinkholeCreationEventListener{
	private FarmWorker worker;
	
	public FarmWorkerSinkholeCreationEventListener(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.SpringCreationEventListener#springCreationEventOccurred(org.streamfarm.events.SpringCreationEvent)
	 */
	@Override
	public void sinkholeCreationEventOccurred(SinkholeCreationEvent evt) {
		this.worker.addSinkhole(evt.getSinkhole());
	}	
}

class FarmWorkerSpringDeletionEventListener implements SpringDeletionEventListener{
	private FarmWorker worker;
	
	public FarmWorkerSpringDeletionEventListener(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.SpringDeletionEventListener#springDeletionEventOccurred(org.streamfarm.events.SpringDeletionEvent)
	 */
	@Override
	public void springDeletionEventOccurred(SpringDeletionEvent evt) {
		//Just for now assume that deletion of all the Springs of the protocol type mentioned in the evt
		if(evt.getProtocol() != null){
			this.worker.deleteAllSprings(evt.getProtocol());	
		}else{
			this.worker.deleteAllSprings();
		}
	}	
}

class FarmWorkerSinkholeDeletionEventListener implements SinkholeDeletionEventListener{
	private FarmWorker worker;
	
	public FarmWorkerSinkholeDeletionEventListener(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.SpringDeletionEventListener#springDeletionEventOccurred(org.streamfarm.events.SpringDeletionEvent)
	 */
	@Override
	public void sinkholeDeletionEventOccurred(SinkholeDeletionEvent evt) {
		//Just for now assume that deletion of all the Springs of the protocol type mentioned in the evt
		if(evt.getProtocol() != null){
			this.worker.deleteAllSinkholes(evt.getProtocol());	
		}else{
			this.worker.deleteAllSinkholes();
		}
	}	
}

class SpringConnectedEventListenerImpl implements SpringConnectedEventListener{
	private FarmWorker worker;
	
	public SpringConnectedEventListenerImpl(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.SpringConnectedEventListener#connectedEventOccurred(org.streamfarm.events.SpringConnectedEvent)
	 */
	@Override
	public void connectedEventOccurred(SpringConnectedEvent evt) {
		this.worker.recordAsConnected(evt.protocol, evt.host, evt.port);
	}
	
}

class FarmWorkerPokeEventListener implements WorkerPokeEventListener{
	private FarmWorker worker;
	private int pokeCount;
	
	public FarmWorkerPokeEventListener(FarmWorker worker){
		this.worker = worker;
	}
	
	/* (non-Javadoc)
	 * @see org.streamfarm.events.WorkerPokeEventListener#workerPokeEventOccurred(org.streamfarm.events.WorkerPokeEvent)
	 */
	@Override
	public void workerPokeEventOccurred(WorkerPokeEvent evt) {
		this.worker.updateSpringsDataRate();
		this.worker.updateSinkholesDataRate();
	}	
}