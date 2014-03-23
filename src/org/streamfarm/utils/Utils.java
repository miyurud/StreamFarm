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
package org.streamfarm.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * @author miyuru
 *
 */
public class Utils {
	
	/**
	 * A method to obtain a single String out of an Exception's StackTrace
	 * @param e - Exception of which the stack trace need to be converted to String
	 * @return - a String with the full stack trace
	 */
	public static String getStackTraceAsString(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
	
	/**
	 * A method to full contents of a text file. 
	 * @param file - name of the file to read
	 * @return - a String of the file contents
	 */
	public static String readAllText(String file){
		StringBuffer sb = new StringBuffer();
		try{
	    File f = new File(file);
	    FileReader fr = new FileReader(f);
	    BufferedReader br = new BufferedReader(fr);

	    String eachLine = br.readLine();

	    while (eachLine != null) {
	      sb.append(eachLine);
	      sb.append("\n");
	      eachLine = br.readLine();
	    }
		}catch(IOException e){
			Logger.getLogger(Conts.UTILS_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return null;
		}
		
	    return sb.toString();
	}
	
	public static ArrayList<String> getHostsList(){
		Properties prop = new Properties();
		ArrayList<String> hosts = new ArrayList<String>();
		
		try {
			prop.load(new FileInputStream(Conts.FARM_CONFIG_FILE));
		} catch (FileNotFoundException e) {
			Logger.getLogger(Conts.UTILS_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return null;
		} catch (IOException e) {
			Logger.getLogger(Conts.UTILS_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return null;
		}
		
		String[] hostArr = prop.getProperty("hosts").split(",");
		
		for (String item : hostArr){
			hosts.add(item.trim());
		}
		
		return hosts;
	}
	
	public static String getMD5Digest(String in) throws NoSuchAlgorithmException{
		String result = null;
		
		MessageDigest m = MessageDigest.getInstance("MD5");
		byte[] data = in.getBytes();
		m.update(data, 0, data.length);
		
		BigInteger i = new BigInteger(1, m.digest());
		result = String.format("%1$032X", i);
		
		return result;
	}
}
