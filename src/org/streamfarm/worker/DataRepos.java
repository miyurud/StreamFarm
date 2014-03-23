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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.streamfarm.utils.Conts;
import org.streamfarm.utils.Utils;

/**
 * @author miyuru
 *
 */
public class DataRepos {
	private String dataReposPath;
	
	public DataRepos(){
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(Conts.FARM_CONFIG_FILE));
		} catch (FileNotFoundException e) {
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		} catch (IOException e) {
			Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : " + e.getMessage() + "\r\nError Details : \r\n" + Utils.getStackTraceAsString(e));
		}
		
		dataReposPath = prop.getProperty("localrepos");
		
		File repos = new File(dataReposPath);
		
		if (!repos.exists()){
			boolean success = repos.mkdir();
			
			if (!success){
				Logger.getLogger(Conts.WORKER_LOGGER_NAME).error("Error : Could not create local data repository at " + dataReposPath);
			}
		}
	}
	
	public boolean isAVailable(String fileName){
		boolean result = false;
		
		result = new File(dataReposPath + "/" + fileName).exists();
		
		return result;
	}

	/**
	 * @return
	 */
	public String getReposPath() {
		return dataReposPath;
	}
}
