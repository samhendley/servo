/**
 * Copyright 2013 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.servo.aws;

/**
 * Enum key values for setting aws related properties.
 */
public enum AwsPropertyKeys {
	
	AWS_CREDENTIALS_FILE("com.netflix.servo.aws.credentialsFile"), 
	AWS_AUTO_SCALING_END_POINT("com.netflix.servo.aws.endpoint.autoscaling"), 
	AWS_CLOUD_WATCH_END_POINT("com.netflix.servo.aws.endpoint.cloudwatch");

	private String bundle;
	
	/**
	 * Constructor responsible to instantiate the type of bundle
	 */
	private AwsPropertyKeys(String bundle) {
       this.bundle = bundle;
    }
	
	public String getBundle() {
		return bundle;
	}
	
}
