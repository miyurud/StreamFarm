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

package org.streamfarm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Dictionary;


import org.apache.log4j.Logger;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class FarmManagerDBComm {
	
	public Connection getDBConnection(){
		try {
			return DriverManager.getConnection("jdbc:hsqldb:mem:streamfarm_manager", "SA", "");
		} catch (SQLException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			return null;
		}
	}
	
	public void initFarmManagerDB(){
		Connection con = this.getDBConnection();
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS spring(idspring INT NOT NULL IDENTITY, host VARCHAR(25) NULL, port INT NULL, type VARCHAR(25) NULL, label VARCHAR(25) NULL, datarate FLOAT NULL);");
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS sinkhole(idsinkhole INT NOT NULL IDENTITY, host VARCHAR(25) NULL, port INT NULL, type VARCHAR(25) NULL, label VARCHAR(25) NULL, datarate FLOAT NULL);");
		} catch (SQLException e) {
			Logger.getLogger(Conts.MANAGER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
			e.printStackTrace();
		}
		Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Created StreamFarm in-memory database.");
	}
}
