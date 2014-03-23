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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.streamfarm.comm.Protocols;
import org.streamfarm.events.FarmShutdownEvent;
import org.streamfarm.events.FarmShutdownEventListener;
import org.streamfarm.events.SpringConnectedEvent;
import org.streamfarm.events.SpringConnectedEventListener;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * This class creates a TCP Spring using a sample data file given
 * @author miyuru
 *
 */
public class FileSpringTCP extends Thread implements Spring {
	private ServerSocket serverSocket;
	private ArrayList<String> fileContents;
	private int linePointerPosition;
	private int springPort;
	private boolean isLive;
	private int lineCounter;
	private SpringConnectedEventListener listener;
	private long emittedByteCount;
	private long timeStamp;
	
	public FileSpringTCP(String filePath) {
		super();
		springPort = createFileSpringTCP(filePath);
		isLive = true;
	}
	
	/**
	 * This method serves the contents
	 */
	public void run(){
		while(true){
			Socket socket = null;
						
			try {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Waiting for connection.");
				socket = serverSocket.accept();
				//To do in future 
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("TCP File Spring Got connection from : " + socket.getInetAddress().getHostName() + " from port " + socket.getPort());
				
			} catch(SocketException ec){
				//Just do not do anything on this
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Socket Closed.");
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
			
			try {
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				timeStamp = System.currentTimeMillis();
				while((!out.checkError()) && isLive){
					String data = new String(getNextData());
					emittedByteCount += data.getBytes().length;
					out.println(data);
					out.flush();
					//This is just to control sending of packets
					try {
						Thread.currentThread().sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Completed conversation.");
				out.close();
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
		}
	}	

	/**
	 * @param springConnectedEvent
	 */
	private void fireConnectedEvent(SpringConnectedEvent evt) {
		listener.connectedEventOccurred(evt);
	}

	public void addConnectedEventListener(SpringConnectedEventListener listener){
		this.listener = listener;
	}
	
	/**
	 * @param filePath
	 * @return
	 */
	private int createFileSpringTCP(String filePath) {
		try{
			serverSocket = new ServerSocket();
			serverSocket.bind(null);
		}
		catch(Exception e){
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return -1;
		}
				
		File inFile = new File(filePath);
		
		if ( inFile.length() <= Conts.MAX_IN_FILE_LEN){
			fileContents = new ArrayList();
			
			String contentItem = "";
			
			try {
				BufferedReader fin = new BufferedReader(new FileReader(inFile));
				
				while((contentItem = fin.readLine()) != null){
					fileContents.add(contentItem);
					lineCounter += 1; 
				}
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("File read complete");
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Line count : " + lineCounter);
			} catch (FileNotFoundException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return -1;
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return -1;
			}
		}else{
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Need to implement");
		}
		
		return serverSocket.getLocalPort();
	}
	
	/**
	 * This method closes the socket of a FileStreamTCP object forcefully
	 */
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
	 * @return the springPort
	 */
	public int getSpringPort() {
		return springPort;
	}
	
	private String getNextData() {		
		if (linePointerPosition >= lineCounter){
			linePointerPosition = 0; //Just send the data in a round robbin fashion
		}

		String result = null;		
		result = fileContents.get(linePointerPosition);	
		linePointerPosition += 1;
		return result;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Spring#getProtocol()
	 */
	@Override
	public String getProtocol() {
		return Protocols.TCP;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Spring#getEmittedByteCount()
	 */
	@Override
	public double getDataRate() {
		double result = 0;
		long timeDiff = System.currentTimeMillis() - timeStamp;

		if(timeDiff > 0){
			result = emittedByteCount * 1000 / (double)timeDiff;			
		}

		emittedByteCount = 0; //Reset the byte count during each request
		timeStamp = System.currentTimeMillis();
		return result;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Spring#getPort()
	 */
	@Override
	public int getPort() {
		return serverSocket.getLocalPort();
	}

}
