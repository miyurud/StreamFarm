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
package org.streamfarm.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.junit.Test;
import org.streamfarm.utils.Conts;


/**
 * @author miyuru
 *
 */
public class FileSpringUDPTest {
	@Test public void requestPackets(int port){
		
		
		
		try {
			InetAddress ipAddress = InetAddress.getByName("localhost");

		byte[] sendData = new byte[Conts.PACKET_SIZE];
		byte[] recvData = new byte[Conts.PACKET_SIZE];
		
		DatagramPacket sendPacket = new DatagramPacket(sendData, Conts.PACKET_SIZE, ipAddress, port);

		DatagramSocket socket = new DatagramSocket();
		socket.send(sendPacket);
		int counter = 0;
		
		while (true){
			recvData = new byte[Conts.PACKET_SIZE];
			DatagramPacket recvPacket = new DatagramPacket(recvData, Conts.PACKET_SIZE);
			socket.receive(recvPacket);
			System.out.println(new String(recvPacket.getData()));
			counter += 1;
			socket.send(sendPacket);
			
			if (counter > 100){
				break;
			}
		}
		
		socket.close();
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
