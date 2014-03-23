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
package org.streamfarm.comm;

/**
 * @author miyuru
 *
 */
public class FarmManagerProtocol {
	public static final String QUERY = "query";
	public static final String QUERY_ACK = "query-ok";
	public static final String CREATE_SPRING = "create-spring";
	public static final String SEND_PROTOCOL_TYPE = "type?";
	public static final String SEND_FILE = "file?";
	public static final String FILE_ACK = "file-ok";
	public static final String SEND_FILE_NAME = "file-name?";
	public static final String IS_FILE_COMPLETE = "file-complete?";
	public static final String SEND_FILE_COMPLETE = "send-complete";
	public static final String FILE_RECV_ERROR = "file-recv-err";
	public static final String CREATE_SINKHOLE = "create-sinkhole";
	public static final String DATA_RATE_FULL_SPRING = "dr-sp-full";
	public static final String DATA_RATE_FULL_SINKHOLE = "dr-sh-full";
	public static final String HASH = "hash";
	public static final String STATE = "state";
	public static final String DELETE_SPRINGS = "delete-springs";
	public static final String DELETE_SINKHOLES = "delete-sinkholes";
	public static final String DELETE_ACK = "delete-ok";
	public static final String EMPTY_RESPONSE = "empty";
	public static String CLOSE = "close";
	public static String CLOSE_ACK = "close-ok";
	public static String SHUTDOWN = "shtdn";
	public static String SHUTDOWN_ACK = "shtdn-ok";
	public static String READY = "ready";
	public static String OK = "ok";
	public static String NO_RESP = "?";
}
