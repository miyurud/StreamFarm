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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import org.streamfarm.FileSpringTCP;
import org.streamfarm.FileSpringUDP;
import org.streamfarm.Sinkhole;
import org.streamfarm.SinkholeTCP;
import org.streamfarm.Spring;
import org.streamfarm.comm.FarmManagerProtocol;
import org.streamfarm.comm.Protocols;
import org.streamfarm.events.FarmShutdownEvent;
import org.streamfarm.events.FarmShutdownEventListener;
import org.streamfarm.events.SinkholeCreationEvent;
import org.streamfarm.events.SinkholeCreationEventListener;
import org.streamfarm.events.SinkholeDeletionEvent;
import org.streamfarm.events.SinkholeDeletionEventListener;
import org.streamfarm.events.SpringCreationEvent;
import org.streamfarm.events.SpringCreationEventListener;
import org.streamfarm.events.SpringDeletionEvent;
import org.streamfarm.events.SpringDeletionEventListener;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;



/**
 * @author miyuru
 *
 */
public class WorkerServiceSession extends Thread{
	private Socket sessionSkt;
	private FarmShutdownEventListener listener;
	private SpringCreationEventListener springCreationListener;
	private SpringDeletionEventListener springDeletionListener;
	private SinkholeDeletionEventListener sinkholeDeletionListener;
	private SinkholeCreationEventListener sinkholeCreationListener;
	private boolean isLive;
	private String flowerBedState;
	private String bedDigest;
	private PerfRegistry perfReg;
	
	/**
	 * @return the isLive
	 */
	public boolean isLive() {
		return isLive;
	}

	/**
	 * @param socket
	 */
	public WorkerServiceSession(Socket socket, PerfRegistry reg) {
		sessionSkt = socket;
		isLive = true;
		this.perfReg = reg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(sessionSkt.getInputStream()));
			PrintWriter out = new PrintWriter(sessionSkt.getOutputStream());
			
			String msg = "";
			
			while((msg = in.readLine()) != null){
					if (msg.equals(FarmManagerProtocol.CLOSE)){
						out.println(FarmManagerProtocol.CLOSE_ACK);
						out.flush();
						out.close();
						in.close();
						sessionSkt.close();
						isLive = false;
						break;
					}else if (msg.equals(FarmManagerProtocol.READY)){
						out.println(FarmManagerProtocol.OK);
						out.flush();
					}else if (msg.equals(FarmManagerProtocol.STATE)){
						out.println(flowerBedState);
						flowerBedState = FarmManagerProtocol.OK; //After sending the data make it to defualt response
						out.flush();
					}else if(msg.equals(FarmManagerProtocol.SHUTDOWN)){
						out.println(FarmManagerProtocol.SHUTDOWN_ACK);
						out.flush();
						msg = sessionSkt.getRemoteSocketAddress().toString();
						fireShutdownEvent(new FarmShutdownEvent("Got shutdown request from host : " + msg));
						out.close();
						sessionSkt.close();
						isLive = false;
						break;
					}else if(msg.equals(FarmManagerProtocol.CREATE_SPRING)){
						out.println(FarmManagerProtocol.SEND_PROTOCOL_TYPE);
						out.flush();
						String protocol = null;
						String fileName = null;
						
						protocol = in.readLine();
						
						out.println(FarmManagerProtocol.SEND_FILE_NAME);
						out.flush();
						
						fileName = in.readLine();
										
						DataRepos repos = new DataRepos();
						
						if (!repos.isAVailable(fileName)){
							out.println(FarmManagerProtocol.SEND_FILE);
							out.flush();
							
							BufferedWriter writer = new BufferedWriter(new FileWriter(repos.getReposPath() + "/" + fileName));
							
							String c = null;
							boolean first = true;
							while(!(c = in.readLine()).equals(FarmManagerProtocol.SEND_FILE_COMPLETE)){
								if (!first){
									writer.newLine();								
								}else{
								first = false;
								}
								writer.write(c);
								writer.flush();
							}
							
							writer.close();
							msg = c;
							
							if (msg.equals(FarmManagerProtocol.SEND_FILE_COMPLETE)){
								out.println(FarmManagerProtocol.FILE_ACK);
								out.flush();
							}else{
								out.println(FarmManagerProtocol.FILE_RECV_ERROR);
								out.flush();
							}
							
						}else{
							out.println(FarmManagerProtocol.FILE_ACK);
							out.flush();
						}
						
						if (protocol.equals(Protocols.TCP)){
							FileSpringTCP spring = new FileSpringTCP(repos.getReposPath() + "/" + fileName);
							spring.start();
							//Inform the FarmWorker about creation of the new spring
							fireSpringCreationEvent(new SpringCreationEvent(spring));
							
							out.println(spring.getSpringPort());
							out.flush();
						}else if (protocol.equals(Protocols.UDP)){
							FileSpringUDP spring = new FileSpringUDP(repos.getReposPath() + "/" + fileName);
							spring.start();
							//Inform the FarmWorker about creation of the new spring
							fireSpringCreationEvent(new SpringCreationEvent(spring));
							
							out.println(spring.getSpringPort());
							out.flush();
						}
					}else if(msg.equals(FarmManagerProtocol.CREATE_SINKHOLE)){
						Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Got request");
						out.println(FarmManagerProtocol.SEND_PROTOCOL_TYPE);
						out.flush();
						String protocol = null;
						
						protocol = in.readLine();
						
						Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Prot is : " + protocol);
						
						if (protocol.equals(Protocols.TCP)){
							SinkholeTCP sinkhole = new SinkholeTCP();
							sinkhole.start();
							//Inform the FarmWorker about creation of the new sinkhole
							fireSinkholeCreationEvent(new SinkholeCreationEvent(sinkhole));
							out.println(sinkhole.getPort());
							out.flush();
						}else if (protocol.equals(Protocols.UDP)){
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("UDP not impl");
							throw new UnsupportedOperationException("Need to implement UDP sinkhole");
						}else{
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Protocol is not identified : " + protocol);
							throw new UnsupportedOperationException("Cannot identify the type of protocol : " + protocol);
						}
					}else if(msg.equals(FarmManagerProtocol.DELETE_SPRINGS)){
						Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Got request");
						out.println(FarmManagerProtocol.SEND_PROTOCOL_TYPE);
						out.flush();
						String protocol = null;
						
						protocol = in.readLine();
						
						if (protocol.equals(Protocols.TCP)){
							//Inform the FarmWorker about deletion of TCP Springs
							fireSpringDeleteEvent(new SpringDeletionEvent(Protocols.TCP));
							out.println(FarmManagerProtocol.DELETE_ACK);
							out.flush();
						}else if (protocol.equals(Protocols.UDP)){
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("UDP not impl");
							throw new UnsupportedOperationException("Need to implement UDP sinkhole");
						}else{
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Protocol is not identified : " + protocol);
							throw new UnsupportedOperationException("Cannot identify the type of protocol : " + protocol);
						}
						
					}else if(msg.equals(FarmManagerProtocol.DELETE_SINKHOLES)){
						Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Got request");
						out.println(FarmManagerProtocol.SEND_PROTOCOL_TYPE);
						out.flush();
						String protocol = null;
						
						protocol = in.readLine();
						
						if (protocol.equals(Protocols.TCP)){
							//Inform the FarmWorker about deletion of TCP Sinkholes
							out.println(FarmManagerProtocol.DELETE_ACK);
							out.flush();
						}else if (protocol.equals(Protocols.UDP)){
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("UDP not impl");
							throw new UnsupportedOperationException("Need to implement UDP sinkhole");
						}else{
							Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Protocol is not identified : " + protocol);
							throw new UnsupportedOperationException("Cannot identify the type of protocol : " + protocol);
						}
						
					} else if(msg.equals(FarmManagerProtocol.DATA_RATE_FULL_SPRING)){
						String result = "|";
						for (Entry<String, Double> mapEntry : perfReg.springsDataRateMap.entrySet()){
							result += mapEntry.getKey() + "-" + mapEntry.getValue() + "-";
						}
						result += "|";
						out.println(result);
						out.flush();
					}else if(msg.equals(FarmManagerProtocol.DATA_RATE_FULL_SINKHOLE)){
						String result = "|";
						for (Entry<String, Double> mapEntry : perfReg.sinkholesDataRateMap.entrySet()){
							result += mapEntry.getKey() + "-" + mapEntry.getValue() + "-";
						}
						result += "|";
						out.println(result);
						out.flush();
					}
			}			
		} catch (IOException e) {
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}

	/**
	 * @param springDeleteEvent
	 */
	private void fireSpringDeleteEvent(SpringDeletionEvent evt) {
		springDeletionListener.springDeletionEventOccurred(evt);
	}

	/**
	 * @param farmWorkerSpringDeletionEventListener
	 */
	public void addSpringDeletionEventListener(
			FarmWorkerSpringDeletionEventListener listener) {
		this.springDeletionListener = listener;
	}

	/**
	 * @param springDeleteEvent
	 */
	private void fireSinkholeDeleteEvent(SinkholeDeletionEvent evt) {
		sinkholeDeletionListener.sinkholeDeletionEventOccurred(evt);
	}
	
	/**
	 * @param farmWorkerSinkholeDeletionEventListener
	 */
	public void addSinkholeDeletionEventListener(
			FarmWorkerSinkholeDeletionEventListener listener) {
		this.sinkholeDeletionListener = listener;
	}	
	
	/**
	 * @param farmShutdownEvent
	 */
	private void fireShutdownEvent(FarmShutdownEvent evt){
		listener.shutdownEventOccurred(evt);
	}
	
	public void addShutdownEventListener(FarmShutdownEventListener listener){
		this.listener = listener;
	}
	
	private void fireSpringCreationEvent(SpringCreationEvent evt){
		springCreationListener.springCreationEventOccurred(evt);
	}
	
	public void addSpringCreationEventListener(SpringCreationEventListener listener){
		this.springCreationListener = listener;
	}
	
	private void fireSinkholeCreationEvent(SinkholeCreationEvent evt){
		sinkholeCreationListener.sinkholeCreationEventOccurred(evt);
	}
	
	public void addSinkholeCreationEventListener(SinkholeCreationEventListener listener){
		this.sinkholeCreationListener = listener;
	}
	
	public void updateState(String newState){
		if(flowerBedState.equals(FarmManagerProtocol.OK)){
			flowerBedState = newState;
		}else{
			flowerBedState += newState;
		}
	}
}
