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

import java.io.File;

/**
 * @author miyuru
 *
 */
public class Conts {
	
	static {	
		APP_DIR = "/nfs/home/miyuru/Developments/streamfarm/Dev15/bin";
	}
	
	public static final String MANAGER_LOGGER_NAME = "org.streamfarm.manager";
	public static final String WORKER_LOGGER_NAME = "org.streamfarm.worker";
	public static final String UTILS_LOGGER_NAME = "org.streamfarm.utils";
	public static final int MAX_IN_FILE_LEN = 10 * 1024 * 1024; //10MB
	public static final int PACKET_SIZE = 1024; //packet size in bytes
	
	public static final int FARM_MANAGER_PORT = 4231;  //SpringManager port
	public static final int FARM_WORKER_PORT = 4232;  //SpringWorker port
	public static final long WORKER_INIT_TIME = 2000;	//Give 2000 milliseconds for worker to get ready
	
	public static final String APP_DIR; //At the moment this value is read from the file system and is expressed with respect to bin
	public static final String FARM_CONFIG_FILE = APP_DIR + "/streamfarm.properties";
	
	public static final int FLOWERBED_POLLING_TIME = 2000; //In milliSeconds
	public static final int WORKER_POLLING_TIME = 5000; //In milliSeconds
}
