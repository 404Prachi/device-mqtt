/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @microservice:  device-mqtt
 * @author: Jim White, Dell
 * @version: 1.0.0
 *******************************************************************************/
package org.edgexfoundry.domain;

import java.util.Map;
import java.util.UUID;

@SuppressWarnings("unused")
public class CmdMsg {
	
	private String cmd;
	private String method;
	private String uuid;
	private String param;

	public CmdMsg(String cmd, String method) {
		this.cmd = cmd;
		this.method = method;
		this.uuid = UUID.randomUUID().toString();
	}

	public CmdMsg(String cmd, String method, String param) {
		this(cmd, method);
		this.param = param;
	}
	
	public String getUuid(){
		return uuid;
	}

}
