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

package org.streamfarm.events;

import java.util.EventObject;

/**
 * @author miyuru
 *
 */
public class SinkholeDeletionEvent extends EventObject {
	private String protocol; 
	/**
	 * @param source
	 */
	public SinkholeDeletionEvent(Object source) {
		super(source);
	}

	/**
	 * This is just to cater the scenario of deleting * sinkholes
	 * E.g. DELETE TCP SINKHOLES * ON st01
	 */
	public SinkholeDeletionEvent() {
		super(null);
	}
	
	/**
	 * This Constructor accepts the protocol type to be deleted 
	 * @param prot The protocol name of the Sinkhole to be deleted.
	 */
	public SinkholeDeletionEvent(String prot){
		super(prot);
		this.protocol = prot;
	}
	
	/**
	 * Return the enclosing protocol type of this object
	 * @return
	 */
	public String getProtocol() {
		return protocol;
	}
}
