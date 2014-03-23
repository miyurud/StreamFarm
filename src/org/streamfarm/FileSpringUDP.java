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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.apache.log4j.Logger;
import org.streamfarm.comm.Protocols;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class FileSpringUDP extends Thread implements Spring{
	private DatagramSocket serverSocket;
	private byte[] fileContents;
	private long filePointerPosition;
	private long inFileLen;
	private int springPort;
	private long emittedByteCount;
	private long timeStamp;
	
	
	/**
	 * @return the springPort
	 */
	public int getSpringPort() {
		return springPort;
	}

	/**
	 * @param string
	 */
	public FileSpringUDP(String filePath) {
		super();
		springPort = createFileSpringUDP(filePath);
	}	
	
	/**
	 * This method serves the contents
	 */
	public void run(){
		while(true){
			byte[] receiveData = new byte[1024];
			byte[] sendData = new byte[1024];
			
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			try {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Waiting for packet");
				serverSocket.receive(receivePacket);
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Got one from : " + receivePacket.getAddress().getHostName() + " from port " + receivePacket.getPort());
				
			} catch(SocketException ec){
				//Just do not do anything on this
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Socket Closed.");
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
			
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("OK1");
			InetAddress senderIPAddress = receivePacket.getAddress();
			int senderPort = receivePacket.getPort();
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("OK2");
			
			if (senderPort == -1){	//This means the socket has already been closed
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : The socket has already been closed.");
				return;
			}
			
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("OK3");
	
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("OK4");
			
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, senderIPAddress, senderPort);
			try {
				timeStamp = System.currentTimeMillis();
				while(serverSocket.isConnected()){
					sendData = getNextData();
					sendPacket = new DatagramPacket(sendData, sendData.length, senderIPAddress, senderPort);
					serverSocket.send(sendPacket);
					//This is just to control sending of packets
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).info("Completed conversation.");
			} catch (IOException e) {
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			}
		}
	}
	
	/**
	 * @return
	 */
	private byte[] getNextData() {		
		if (filePointerPosition >= inFileLen){
			filePointerPosition = 0; //Just send the packets in a round robbin fashion
		}
		
		byte[] packet = null;
				
		if ((inFileLen - filePointerPosition) <= Conts.PACKET_SIZE){
			packet = new byte[(int)inFileLen]; //Definitely we know that inFileLen < PACKET_SIZE which is an int
			
			for(int i = 0; i < inFileLen; i++){
				packet[i] = fileContents[i];
			}
			filePointerPosition = inFileLen;
			emittedByteCount += inFileLen;
		}else{
			packet = new byte[Conts.PACKET_SIZE];
			
			for(int i = 0; i < Conts.PACKET_SIZE; i++){
				packet[i] = fileContents[i + (int)filePointerPosition];
			}
			
			filePointerPosition += Conts.PACKET_SIZE;
			emittedByteCount += Conts.PACKET_SIZE;
		}		
		
		return packet;
	}

	private int createFileSpringUDP(String filePath){
		try{
			serverSocket = new DatagramSocket();
		}
		catch(Exception e){
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return -1;
		}
				
		File inFile = new File(filePath);
		inFileLen = inFile.length();
		
		if ( inFileLen <= Conts.MAX_IN_FILE_LEN){
			int len = (int)inFileLen;
			fileContents = new byte[len];
			try {
				FileInputStream fin = new FileInputStream(inFile);
				fin.read(fileContents);
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
	 * This method closes the socket of a FileStreamUDP object forcefully
	 */
	public void close() {
		this.interrupt();
		serverSocket.close();	
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Spring#getProtocol()
	 */
	@Override
	public String getProtocol() {
		return Protocols.UDP;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Spring#getEmittedByteCount()
	 */
	@Override
	public double getDataRate() {
		long result = 0;
		long timeDiff = System.currentTimeMillis() - timeStamp;

		if(timeDiff > 0){
			result = emittedByteCount * 1000 / timeDiff;			
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
