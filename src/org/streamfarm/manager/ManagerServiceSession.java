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

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;
import org.streamfarm.comm.FarmManagerProtocol;
import org.streamfarm.db.FarmManagerDBComm;
import org.streamfarm.events.FarmShutdownEvent;
import org.streamfarm.events.FarmShutdownEventListener;
import org.streamfarm.query.QueryResults;
import org.streamfarm.query.StreamFarmLexer;
import org.streamfarm.query.StreamFarmParser;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

import org.antlr.runtime.CommonToken;
import antlr.MismatchedTokenException;
import antlr.RecognitionException;
import antlr.Token;

/**
 * @author miyuru
 *
 */
public class ManagerServiceSession extends Thread{
	private Socket sessionSkt;
	private FarmShutdownEventListener listener;
	private FarmManagerDBComm db;
	private StreamFarmParser farmParser;
	
	/**
	 * @param socket
	 */
	public ManagerServiceSession(Socket socket) {
		sessionSkt = socket;
		db = new FarmManagerDBComm();
		farmParser = new StreamFarmParser(null);
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(sessionSkt.getInputStream()));
			PrintWriter out = new PrintWriter(sessionSkt.getOutputStream());
			String msg = "";
			
			byte[] line = new byte[10];
			
			while((msg = buff.readLine()) != null){		
						if (msg.equals(FarmManagerProtocol.CLOSE)){
							out.println(FarmManagerProtocol.CLOSE_ACK);
							out.flush();
							out.close();
							buff.close();
							sessionSkt.close();
							break;
						}else if (msg.equals(FarmManagerProtocol.SHUTDOWN)){
						out.println(FarmManagerProtocol.SHUTDOWN_ACK);
						out.flush();
						out.close();
						msg = sessionSkt.getRemoteSocketAddress().toString();
						sessionSkt.close();
						fireShutdownEvent(new FarmShutdownEvent("Got shutdown request from host : " + msg));
						break;
					}else if (msg.equals(FarmManagerProtocol.READY)){
						out.println(FarmManagerProtocol.OK);
						out.flush();						
					}else if(msg.equals(FarmManagerProtocol.QUERY)){
						out.println(FarmManagerProtocol.QUERY_ACK);
						out.flush();
						msg = buff.readLine();
						
						Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("MSG is : |" + msg + "|");
											
				        StreamFarmLexer lex = new StreamFarmLexer(new ANTLRStringStream(msg));
				        CommonTokenStream tokens = new CommonTokenStream(lex);
				        
				        farmParser.setTokenStream(tokens);
				        List<CommonToken> list = tokens.getTokens();
				        
				        try {
				        	QueryResults result = farmParser.expr();
				        	
				        	if (result == null){
				        		msg = "error";
				        	}else{
				        	
							switch (result){
							case ACCEPT:
								msg = "accept";
								break;
							case ERROR:								
								break;
							case SELECT_AST_PROT_SPRINGS://Case 1
								msg = "SELECT_AST_PROT_SPRINGS";
								break;								
							case SELECT_N_PROT_SPRINGS://Case 2
								msg = selectSprings(list);
								break;
							case SELECT_AST_PROT_SINKHOLES://Case 3
								msg = "SELECT_AST_PROT_SINKHOLES";
								break;								
							case SELECT_N_PROT_SINKHOLES://Case 4
								msg = "SELECT_N_PROT_SINKHOLES";
								break;					
							case LIST_STATUS: //Case 5
								msg = getSystemStatus();
								break;			
							case CREATE_N_PROTOCOL_SPRINGS_FROM_FILE_ON_HOST_AS_VARNAME: //Case 6
								msg = createSprings(list);
								break;								
							case DELETE_SPRINGS_AST_ON_HOST://Case 7
								msg = "DELETE_SPRINGS_AST_ON_HOST";
								break;									
							case DELETE_PROT_SPRINGS_AST_ON_HOST://Case 8
								msg = deleteSprings(list);
								break;
							case DELETE_PROT_SPRINGS_AST_ON_HOST_OF_VARNAME://Case 9
								msg = "DELETE_PROT_SPRINGS_AST_ON_HOST_OF_VARNAME";
								break;								
							case DELETE_SPRINGS_AST_ON_HOST_OF_VARNAME://Case 10
								msg = "DELETE_SPRINGS_AST_ON_HOST_OF_VARNAME";
								break;								
							case DELETE_PROT_SPRINGS_N_ON_HOST://Case 11
								msg = "DELETE_PROT_SPRINGS_N_ON_HOST";
								break;									
							case CREATE_N_PROT_SINKHOLES_ON_HOST_AS_VARNAME://Case 12
								msg = createSinkholes(list);
								break;
							case DELETE_SINKHOLES_AST_ON_HOST://Case 13
								msg = "DELETE_SINKHOLES_AST_ON_HOST";
								break;								
							case DELETE_PROT_SINKHOLES_AST_ON_HOST://Case 14
								msg = deleteSinkholes(list);
								break;
							case DELETE_PROT_SINKHOLES_N_ON_HOST://Case 15
								msg = "DELETE_PROT_SINKHOLES_N_ON_HOST";
								break;	
							case SELECT_DATARATE_FROM_SPRINGS://Case 16
								msg = getSpringsDataRate(list);
								break;	
							case SELECT_DATARATE_FROM_SPRINGS_AST_OF_VARNAME://Case 17
								msg = getSpringsDataRateOfApp(list);
								break;
							case SELECT_DATARATE_FROM_SPRINGS_AST_ON_HOST://Case 18
								msg = "SELECT_DATARATE_FROM_SPRINGS_AST_ON_HOST";
								break;
							case SELECT_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST://Case 19
								msg = "SELECT_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST";
								break;
							case SELECT_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST://Case 20
								msg = "SELECT_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST";
								break;
							case SELECT_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST://Case 21
								msg = "SELECT_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST";
								break;								
							case SELECT_DATARATE_FROM_SINKHOLES://Case 22
								msg = getSinkholesDataRate(list);
								break;			
							case SELECT_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME://Case 23
								msg = getSinkholeDataRateOfApp(list);
								break;		
							case SELECT_DATARATE_FROM_SINKHOLES_AST_ON_HOST://Case 24
								msg = "SELECT_DATARATE_FROM_SINKHOLES_AST_ON_HOST";
								break;	
							case SELECT_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST:
								msg = "SELECT_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST"; //Case 25
								break;	
							case SELECT_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST: //Case 26
								msg = "SELECT_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST";
								break;	
							case SELECT_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST: //Case 27
								msg = "SELECT_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST";
								break;	
							case SELECT_SUM_DATARATE_FROM_SPRINGS://Case 28
								msg = getSumSpringsDataRate(list);
								break;
							case SELECT_SUM_DATARATE_FROM_SPRINGS_AST_OF_VARNAME: //Case 29
								msg = getSumSpringsDataRateOfApp(list);
								break;
							case SELECT_SUM_DATARATE_FROM_SPRINGS_AST_ON_HOST: //Case 30
								msg = "SELECT_SUM_DATARATE_FROM_SPRINGS_AST_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST: //Case 31
								msg = "SELECT_SUM_DATARATE_FROM_SPRINGS_AST_OF_VARNAME_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST: //Case 32
								msg = "SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_AST_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST: //Case 33
								msg = "SELECT_SUM_DATARATE_FROM_PROT_SPRINGS_N_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_SINKHOLES: //Case 34
								msg = getSumSinkholesDataRate(list);
								break;
							case SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME: //Case 35
								msg = getSumSinkholesDataRateOfApp(list);
								break;	
							case SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_ON_HOST: //Case 36
								msg = "SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_ON_HOST";
								break;		
							case SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST: //Case 37
								msg = "SELECT_SUM_DATARATE_FROM_SINKHOLES_AST_OF_VARNAME_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST: //Case 38
								msg = "SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_AST_ON_HOST";
								break;
							case SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST: //Case 39
								msg = "SELECT_SUM_DATARATE_FROM_PROT_SINKHOLES_N_ON_HOST";
								break;								
							}
				        	}
				        	
				        } catch (org.antlr.runtime.RecognitionException e) {
				            if (e.getClass().equals(MismatchedTokenException.class)){
				            	msg = "error";
				            }else{
								Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
								msg = "error";
				            }
				        }
											
						out.println(msg);
						out.flush();
					}else{
						out.println(FarmManagerProtocol.NO_RESP);
						out.flush();
					}
			}			
		} catch (IOException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
	}
	
	/**
	 * The method to get sum of data rate received by sinkholes associated with a particular application.
	 * @param list
	 * @return A String with the sum of the data rates
	 */
	private String getSumSinkholesDataRateOfApp(List<CommonToken> list) {
		String numberOfSinkholes = "";
		String protocol = null;
		String appName = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				appName = tokenText;
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSinkholes = tokenText;
			}
		}
			
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		double result = 0;
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT datarate FROM sinkhole WHERE label LIKE '" + appName + "';");
				
		    	while(rs.next()){
		    		result += rs.getFloat(1);
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
				
	return "" + result; //Return the result as a String
	}

	/**
	 * The method returns sum of the data rates received by all the sinks of StreamFarm instance
	 * @param list
	 * @return A String with the sum of the data rate values received by the sinks 
	 */
	private String getSumSinkholesDataRate(List<CommonToken> list) {
		String numberOfSinkholes = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSinkholes = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		double result = 0;
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT datarate FROM sinkhole;");
				
		    	while(rs.next()){
		    		result += rs.getFloat(1);
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
			
	return "" + result; //Return the result as a String
	}

	/**
	 * Returns the sum of all springs associated with a particular application
	 * @param list
	 * @return
	 */
	private String getSumSpringsDataRateOfApp(List<CommonToken> list) {
		String numberOfSprings = "";
		String protocol = null;
		String appName = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				appName = tokenText;
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSprings = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		double result = 0;
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT datarate FROM spring WHERE label LIKE '" + appName + "';");
				
		    	while(rs.next()){
		    		result += rs.getFloat(1);
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
			
	return "" + result;
	}

	/**
	 * The method returns the sum of datarates from all the springs
	 * @param list
	 * @return a String value corresponding to the sum of all data rates of all springs
	 */
	private String getSumSpringsDataRate(List<CommonToken> list) {
		String numberOfSprings = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSprings = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		double result = 0;
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT datarate FROM spring;");
				
		    	while(rs.next()){
		    		result += rs.getFloat(1);
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
			
	return "" + result; //Make the double to a string before returning
	}

	/**
	 * The method returns data rate of sinks of a particular application
	 * @param list
	 * @return
	 */
	private String getSinkholeDataRateOfApp(List<CommonToken> list) {
		String numberOfSinkholes = "";
		String protocol = null;
		String appName = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				appName = tokenText;
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSinkholes = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String result = "|";
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT host, type, port, datarate FROM sinkhole WHERE label LIKE '" + appName + "';");
				
		    	while(rs.next()){
		    		result += rs.getString(1) + "," + rs.getString(2)+ "," + rs.getInt(3)+ "," + rs.getFloat(4) + "|";
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
	
			if(result.equals("|")){
				result = FarmManagerProtocol.EMPTY_RESPONSE;
			}
			
	return result;
	}

	/**
	 * This method gets the data rate of Sinkholes
	 * @param list
	 * @return
	 */
	private String getSinkholesDataRate(List<CommonToken> list) {
		String numberOfSinkholes = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSinkholes = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String result = "|";
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT host, type, port, datarate FROM sinkhole;");
				
		    	while(rs.next()){
		    		result += rs.getString(1) + "," + rs.getString(2)+ "," + rs.getInt(3)+ "," + rs.getFloat(4) + "|";
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
	
			if(result.equals("|")){
				result = FarmManagerProtocol.EMPTY_RESPONSE;
			}
			
	return result;
	}

	/**
	 * The method returns the data rates of springs which belongs to a particular application
	 * @param list
	 * @return
	 */
	private String getSpringsDataRateOfApp(List<CommonToken> list) {
		String numberOfSprings = "";
		String protocol = null;
		String appName = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				appName = tokenText;
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSprings = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String result = "|";
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT host, type, port, datarate FROM spring WHERE label LIKE '" + appName + "';");
				
		    	while(rs.next()){
		    		result += rs.getString(1) + "," + rs.getString(2)+ "," + rs.getInt(3)+ "," + rs.getFloat(4) + "|";
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
			
			if(result.equals("|")){
				result = FarmManagerProtocol.EMPTY_RESPONSE;
			}
			
	return result;
	}

	/**
	 * This method provides the data rate of Springs
	 * @param list
	 * @return
	 */
	private String getSpringsDataRate(List<CommonToken> list) {
		String numberOfSprings = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSprings = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String result = "|";
		
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT host, type, port, datarate FROM spring;");
				
		    	while(rs.next()){
		    		result += rs.getString(1) + "," + rs.getString(2)+ "," + rs.getInt(3)+ "," + rs.getFloat(4) + "|";
		    	}
				
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : INTERNAL DB ERROR.";
			}
	
			if(result.equals("|")){
				result = FarmManagerProtocol.EMPTY_RESPONSE;
			}
			
	return result;
	}

	/**
	 * This method deletes Sinkholes
	 * @param list
	 * @return A message with the status of the deletion operation
	 */
	private String deleteSinkholes(List<CommonToken> list) {
		String msg = null;
		String numberOfSinkholes = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSinkholes = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		for(String host : hostList){
			String response;
			Socket skt;
			try {
				skt = new Socket(host, Conts.FARM_WORKER_PORT);

			PrintWriter out = new PrintWriter(skt.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			out.println(FarmManagerProtocol.DELETE_SINKHOLES);
			out.flush();
			response = reader.readLine();
			
			if (response.equals(FarmManagerProtocol.SEND_PROTOCOL_TYPE)){
				out.println(protocol);
				out.flush();
			}else{
				return "error : Communicating with host " + host + " had problem.";
			}
			
			response = reader.readLine();
				
			if (!response.equals(FarmManagerProtocol.DELETE_ACK)){
				return "error : Communicating with host " + host + " had problem.";
			}				
				
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("resp is " + response);
				
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				stmt.executeUpdate("DELETE FROM sinkhole WHERE host LIKE '" + host + "' and type LIKE '" + protocol + "'");
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : record deletion from db had problem.";
			}
				
			out.println(FarmManagerProtocol.CLOSE);
			out.flush();
				
			response = reader.readLine();
				
			if (!response.equals(FarmManagerProtocol.CLOSE_ACK)){
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Could not close a connection with " + host + " properly");
				return "error : Internal error";
			}
		} catch (UnknownHostException e1) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
			return "error : Internal error";
		} catch (IOException e1) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
			return "error : Internal error";
		}
	}
	
	msg = FarmManagerProtocol.DELETE_ACK; //At this point everything has completed successfully
	return msg;
	}

	/**
	 * This method deletes springs from a host
	 * @param list
	 * @return A message with the status of the deletion
	 */
	private String deleteSprings(List<CommonToken> list) {
		String msg = null;
		String numberOfSprings = "";
		String protocol = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = tokenText;
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if(tknIndex == StreamFarmParser.AST){
				numberOfSprings = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		for(String host : hostList){
			String response;
			Socket skt;
			try {
				skt = new Socket(host, Conts.FARM_WORKER_PORT);

			PrintWriter out = new PrintWriter(skt.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			out.println(FarmManagerProtocol.DELETE_SPRINGS);
			out.flush();
			response = reader.readLine();
			
			if (response.equals(FarmManagerProtocol.SEND_PROTOCOL_TYPE)){
				out.println(protocol);
				out.flush();
			}else{
				return "error : Communicating with host " + host + " had problem.";
			}
			
			response = reader.readLine();
				
			if (!response.equals(FarmManagerProtocol.DELETE_ACK)){
				return "error : Communicating with host " + host + " had problem.";
			}				
				
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("resp is " + response);
				
			FarmManagerDBComm dbCon = new FarmManagerDBComm();
			Connection con = dbCon.getDBConnection();
				
			Statement stmt;
				
			try {
				stmt = con.createStatement();
				//INSERT INTO spring(host, port, type) VALUES ('" + hosts[hostCounter] + "', " + response + ", '" + protocol + "')
				stmt.executeUpdate("DELETE FROM spring WHERE host LIKE '" + host + "' and type LIKE '" + protocol + "'");
			} catch (SQLException e) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
				return "error : record deletion from db had problem.";
			}
				
			out.println(FarmManagerProtocol.CLOSE);
			out.flush();
				
			response = reader.readLine();
				
			if (!response.equals(FarmManagerProtocol.CLOSE_ACK)){
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Could not close a connection with " + host + " properly");
				return "error : Internal error";
			}
		} catch (UnknownHostException e1) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
			return "error : Internal error";
		} catch (IOException e1) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
			return "error : Internal error";
		}
	}
	
	msg = FarmManagerProtocol.DELETE_ACK; //At this point everything has completed successfully
	return msg;
}

	/**
	 * @param list
	 * @return
	 */
	private String createSinkholes(List<CommonToken> list) {
		String msg = null;
		int numberOfSinkholes = 0;
		String protocol = null;
		String label = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSinkholes = Integer.parseInt(tokenText);
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				label = tokenText;
			}
		}
		
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String[] hosts = new String[hostList.size()];
		int k = 0;
		
		for(String str : hostList){
			hosts[k] = str;
			k++;
		}
		
		int sinkCounter = 0;
		int hostsLength = hosts.length;
		int hostCounter = 0;
		String result = "";
			
		while (sinkCounter < numberOfSinkholes){
			String response = null;	
			
			Socket skt;
			try {
				skt = new Socket(hosts[hostCounter], Conts.FARM_WORKER_PORT);

			PrintWriter out = new PrintWriter(skt.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			out.println(FarmManagerProtocol.CREATE_SINKHOLE);
			out.flush();
			response = reader.readLine();
			
			if (response.equals(FarmManagerProtocol.SEND_PROTOCOL_TYPE)){
				out.println(protocol);
				out.flush();
			}else{
				return "error : Communicating with host " + hosts[hostCounter] + " had problem.";
			}
			
				response = reader.readLine();
				
				//This is just to check whether the response is an integer value
				try{
					Integer.parseInt(response);
				}catch(NumberFormatException ec){
					return "error : Host " + hosts[hostCounter] + " could not setup spring.";
				}
				
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("resp is " + response);
				
				FarmManagerDBComm dbCon = new FarmManagerDBComm();
				Connection con = dbCon.getDBConnection();
				
				Statement stmt;
				
				try {
					stmt = con.createStatement();
					stmt.executeUpdate("INSERT INTO sinkhole(host, port, type, label) VALUES ('" + hosts[hostCounter] + "', " + response + ", '" + protocol + "', '" + label + "')");
					con.commit();
					result += "" + hosts[hostCounter] + ":" + response + ";";
				} catch (SQLException e) {
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
					return "error : db population had problem.";
				}
				
				out.println(FarmManagerProtocol.CLOSE);
				out.flush();
				
				response = reader.readLine();
				
				if (!response.equals(FarmManagerProtocol.CLOSE_ACK)){
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Could not close a connection with " + hosts[hostCounter] + " properly");
				}
			} catch (UnknownHostException e1) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
				return "error : Internal error";
			} catch (IOException e1) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
				return "error : Internal error";
			}
			
			sinkCounter += 1;
			hostCounter += 1;
			
			if (hostCounter >= hostsLength ){
				hostCounter = 0;
			}
		}
		
		//msg = "success"; //For temporary
		msg = result;
		return msg;
	}

	/**
	 * @param list
	 * @return
	 */
	private String selectSprings(List<CommonToken> list) {
		String msg = null;
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		while(itr.hasNext()){
			tkn = itr.next();
			
			if (tkn.getText().equals("UDP")){
				msg = "its udp";
			}else if(tkn.getText().equals("TCP")){
				msg = "its tcp";
			}
		}
		
		return msg;
	}

	/**
	 * @param list
	 * @return
	 */
	private String createSprings(List<CommonToken> list) {
		String msg = null;
		int numberOfSprings = 0;
		String protocol = null;
		String sourceFile = null;
		String label = null;
		ArrayList<String> hostList = new ArrayList<String>();
		
		Iterator<CommonToken> itr = list.iterator();
		CommonToken tkn = null;
		while(itr.hasNext()){
			tkn = itr.next();
			String tokenText = tkn.getText();
			int tknIndex = tkn.getType();
			
			if (tknIndex == StreamFarmParser.PROTOCOLS){
				protocol = tokenText;
			}else if(tknIndex == StreamFarmParser.NUMBER){
				numberOfSprings = Integer.parseInt(tokenText);
			}else if (tknIndex == StreamFarmParser.FILEPATH){
				sourceFile = tokenText.substring(1, tokenText.length() - 1);
			}else if (tknIndex == StreamFarmParser.HOSTNAME){
				hostList.add(tokenText);
			}else if (tknIndex == StreamFarmParser.VARNAME){
				label = tokenText;
			}
		}
			
		if(!validateHostsList(hostList)){
			return "error : One or more hosts in the query are not identified.";
		}
		
		String[] hosts = new String[hostList.size()];
		int k = 0;
		
		for(String str : hostList){
			hosts[k] = str;
			k++;
		}
		
		int springCounter = 0;
		int hostsLength = hosts.length;
		int hostCounter = 0;
		String result = "";
		
		while (springCounter < numberOfSprings){
			String response = null;	
			
			Socket skt;
			try {
				skt = new Socket(hosts[hostCounter], Conts.FARM_WORKER_PORT);

			PrintWriter out = new PrintWriter(skt.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			
			out.println(FarmManagerProtocol.CREATE_SPRING);
			out.flush();
			response = reader.readLine();
			
			if (response.equals(FarmManagerProtocol.SEND_PROTOCOL_TYPE)){
				out.println(protocol);
				out.flush();
				
				response = reader.readLine();
				
			}else{
				return "error : Communicating with host " + hosts[hostCounter] + " had problem.";
			}
				
				if (response.equals(FarmManagerProtocol.SEND_FILE_NAME)){
					String temp = new String(sourceFile);
					temp = temp.substring(temp.lastIndexOf("/") + 1);
					out.println(temp);
					out.flush();
					
					response = reader.readLine();
				}else{
					return "error : problem in communicating with " + hosts[hostCounter];
				}
				
				if (response.equals(FarmManagerProtocol.SEND_FILE)){
					BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile)));

					String c = null;
					while ((c = fin.readLine()) != null){
						out.println(c);
						out.flush();
					}

					fin.close();
					
					out.println(FarmManagerProtocol.SEND_FILE_COMPLETE);
					out.flush();
					
					response = reader.readLine();
										
					if (!response.equals(FarmManagerProtocol.FILE_ACK)){
						return "error : Error in transferring file to " + hosts[hostCounter];
					}
				}else if(!response.equals(FarmManagerProtocol.FILE_ACK)){
					return "error : problem in communicating with " + hosts[hostCounter];
				}
				
				response = reader.readLine();
				
				//This is just to check whether the response is an integer value
				try{
					Integer.parseInt(response);
				}catch(NumberFormatException ec){
					return "error : Host " + hosts[hostCounter] + " could not setup spring.";
				}
				
				FarmManagerDBComm dbCon = new FarmManagerDBComm();
				Connection con = dbCon.getDBConnection();
				
				Statement stmt;
				try {
					stmt = con.createStatement();
					stmt.executeUpdate("INSERT INTO spring(host, port, type, label) VALUES ('" + hosts[hostCounter] + "', " + response + ", '" + protocol +"', '" + label + "')");
					con.commit();
					result += "" + hosts[hostCounter] + ":" + response + ";";
				} catch (SQLException e) {
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
					return "error : db population had problem.";
				}
				
				out.println(FarmManagerProtocol.CLOSE);
				out.flush();
				
				response = reader.readLine();
				
				if (!response.equals(FarmManagerProtocol.CLOSE_ACK)){
					Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : Could not close a connection with " + hosts[hostCounter] + " properly");
				}			
			} catch (UnknownHostException e1) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
				return "error : Internal error";
			} catch (IOException e1) {
				Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e1.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e1));
				return "error : Internal error";
			}
			
			springCounter += 1;
			hostCounter += 1;
			
			if (hostCounter >= hostsLength ){
				hostCounter = 0;
			}
		}
		
		//msg = "success"; For the moment
		msg = result;
		return msg;
	}

	/**
	 * @return
	 */
	public String getSystemStatus() {
		String result = "";
		Connection con = db.getDBConnection();
		
		Statement stmt;
		boolean flag = false;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT idspring, host, port, type, label FROM spring");
			result = "Springs:";
	    	while(rs.next()){
	    		result += "" + rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3) + "," + rs.getString(4) + "," + rs.getString(5) +";";
	    		flag = true;
	    	}
	    	
	    	if(!flag){
	    		result += "none";
	    	}
	    	
		} catch (SQLException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			e.printStackTrace();
		}
		
		flag = false;
		
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT idsinkhole, host, port, type, label FROM sinkhole");
			result += ";Sinkholes:";
	    	while(rs.next()){
	    		result += "" + rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3) + "," + rs.getString(4) + "," + rs.getString(5) +";";
	    		flag = true;
	    	}
	    	
	    	if(!flag){
	    		result += "none";
	    	}
	    	
	    	return result;
		} catch (SQLException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public void addShutdownEventListener(FarmShutdownEventListener listener){
		this.listener = listener;
	}
	
	private void fireShutdownEvent(FarmShutdownEvent evt){
		listener.shutdownEventOccurred(evt);
	}
	
	/**
	 * This method validates a list of hosts given as input parameter and compares whith the registered
	 * hosts list. If the host does not exist it returns false.
	 * @param hostList - A list of host name
	 * @return false if a host in the input parameter hosts list is not available in the registered hosts list
	 */
	public boolean validateHostsList(ArrayList<String> hostList){
		String[] hosts = new String[hostList.size()];
		int k = 0;
		
		for(String str : hostList){
			hosts[k] = str;
			k++;
		}
		
		ArrayList<String> registeredHosts = Utils.getHostsList();
		
		//Validate whether the hosts are registered with the system
		for (String host : hosts){
			if (!registeredHosts.contains(host)){
				return false;
			}
		}
		
		return true;
	}
	
}
	