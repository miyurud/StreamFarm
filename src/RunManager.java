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

import org.streamfarm.FileSpringUDP;
import org.streamfarm.manager.FarmManager;
import org.streamfarm.utils.Conts;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * @author miyuru
 *
 */
public class RunManager {
	public static void main(String[] args){
		BasicConfigurator.configure();
		Logger.getLogger(Conts.MANAGER_LOGGER_NAME).info("Starting StreamFarm.");
		FarmManager spm = new FarmManager();
		spm.run();
	}
}
