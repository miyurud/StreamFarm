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

/**
 * @author miyuru
 *
 */
public interface Sinkhole {
	void close();
	
	/**
	 * The method to get the protocol type of the Sinkhole
	 * @return the name of the protocol of this Sinkhole
	 */
	String getProtocol();
	
	/**
	 * This method returns the data rate in bytes/s.
	 */
	double getDataRate();

	/**
	 * @return
	 */
	int getPort();
}
