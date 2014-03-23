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

import org.streamfarm.comm.Protocols;

/**
 * @author miyuru
 *
 */
public class SinkholeUDP extends Thread implements Sinkhole{
	private long receivedByteCount;
	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getEmittedByteCount()
	 */
	@Override
	public double getDataRate() {
		double result = receivedByteCount;
		return result;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getProtocol()
	 * 
	 * This is just a UDP Sinkhole
	 */
	@Override
	public String getProtocol() {
		return Protocols.UDP;
	}

	/* (non-Javadoc)
	 * @see org.streamfarm.Sinkhole#getPort()
	 */
	@Override
	public int getPort() {
		//To be implemented...
		return -1;
	}
}
