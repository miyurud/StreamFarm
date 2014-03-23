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

import org.streamfarm.events.ManagerPokeEvent;
import org.streamfarm.events.ManagerPokeEventListener;
import org.streamfarm.events.WorkerPokeEvent;
import org.streamfarm.events.WorkerPokeEventListener;
import org.streamfarm.utils.Conts;

/**
 * @author miyuru
 *
 */
public class PerfMonitorTimer implements Runnable{
	private ManagerPokeEventListener listener;
	private boolean isRunning;
	
	public PerfMonitorTimer(){
		isRunning = true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(isRunning){
			firePokeEvent(new ManagerPokeEvent(this));
			//Sleep WORKER_POLLING_TIME till next polling session
			try {
				Thread.sleep(Conts.WORKER_POLLING_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param workerPokeEvent
	 */
	private void firePokeEvent(ManagerPokeEvent evt) {
		listener.perfPokeEventOccurred(evt);
	}
	
	public void addPokeEventListener(ManagerPokeEventListener evtListener){
		this.listener = evtListener;
	}
	
	/**
	 * This method shutsdown the timer
	 * 
	 */
	public void close(){
		isRunning = false;
	}
}
