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
package org.streamfarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import org.apache.log4j.Logger;
import org.streamfarm.comm.Protocols;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class SinkholeTCP extends Thread implements Sinkhole{
	
	private ServerSocket serverSocket; 
	private int sinkholePort;
	private boolean isLive;
	private long receivedByteCount;
	private long timeStamp;
	
	public SinkholeTCP(){
		super();
		sinkholePort = createSinkholeTCP();
		isLive = true;
	}
	
	/**
	 * @return
	 */
	private int createSinkholeTCP() {
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(null);
		}
		catch(Exception e){
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return -1;
		}
		
		return serverSocket.getLocalPort();
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#close()
	 */
	@Override
	public void close() {
		this.interrupt();
		isLive = false;
		try {
			serverSocket.close();
		} catch (IOException e) {
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}	
	}
	
	/**
	 * This method receives the contents. This is the essential feature of a Sinkhole.
	 */
	public void run(){
		while(true){
			Socket socket = null;
						
			try {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Waiting for connection.");
				socket = serverSocket.accept();
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("TCP Sinkhole Got connection from : " + socket.getInetAddress().getHostName() + " from port " + socket.getPort());
				
			} catch(SocketException ec){
				//Just do not do anything on this
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Socket Closed.");
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
			
			try {
				InputStream instrm = socket.getInputStream();
				timeStamp = System.currentTimeMillis();
				byte[] charbuff = new byte[1024];
				int readCount = 0;
				while(((readCount = instrm.read(charbuff)) != -1) && isLive){
					receivedByteCount += readCount;
				}
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Completed conversation.");
				instrm.close();
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getEmittedByteCount()
	 */
	@Override
	public double getDataRate() {
		double result = 0;
		long timeDiff = System.currentTimeMillis() - timeStamp;

		if(timeDiff > 0){
			result = receivedByteCount * 1000 / (double)timeDiff;			
		}

		receivedByteCount = 0; //Reset the byte count during each request
		timeStamp = System.currentTimeMillis();
		return result;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getProtocol()
	 * 
	 * This is just a TCP Sinkhole
	 */
	@Override
	public String getProtocol() {
		return Protocols.TCP;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getPort()
	 */
	@Override
	public int getPort() {
		return sinkholePort;
	}	
}