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
 * This class acts as the base class for creating springs. A spring generates data tuples.
 *
 */
public interface Spring {

	/**
	 * The method that closes(shuts down) a spring.
	 */
	void close();

	/**
	 * The method to get the protocol type of the Spring
	 * @return the name of the protocol of this SPring
	 */
	String getProtocol();
	
	/**
	 * This method returns the data rate of the Spring in bytes/s
	 */
	double getDataRate();

	/**
	 * This method returns the port number of the Spring
	 * @return The port number of which the Spring is listening for incomming connections
	 */
	int getPort();
}
