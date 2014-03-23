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

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.streamfarm.comm.FarmManagerProtocol;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class FarmCLI {
	public static void main(String[] args){
		if (args.length == 0){
			System.out.println(Utils.readAllText("CLI Usage.txt"));
		}else{
			String host = args[0];
			
			try {
				Socket skt = new Socket(host, Conts.FARM_MANAGER_PORT);
				System.out.println("Connection with manager host : " + host + " on port : " + Conts.FARM_MANAGER_PORT + ".");
				PrintWriter out = new PrintWriter(skt.getOutputStream());
				BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
				
				BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
				String line = "", msg = "";
				while (!skt.isClosed()){
					line = rdr.readLine();
					System.out.println("request -> " + line);
					out.println(line);
					out.flush();
					line=in.readLine();
					
					if (line != null){
						System.out.println("response -> |" + line + "|");
					}
					
					if (line.equals(FarmManagerProtocol.CLOSE_ACK)){
						break;
					}else if(line.equals(FarmManagerProtocol.SHUTDOWN_ACK)){
						break;
					}
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
