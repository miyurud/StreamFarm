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

import java.util.HashMap;

/**
 * This class holds the performance information (e.g. the data rate)
 * from Springs and Sinkholes of a particular FarmWorker
 * @author miyuru
 *
 */
public class PerfRegistry {
	public HashMap<String, Double> springsDataRateMap;
	public HashMap<String, Double> sinkholesDataRateMap;
}
