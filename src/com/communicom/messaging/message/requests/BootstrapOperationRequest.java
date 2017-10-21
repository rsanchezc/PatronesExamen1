package com.communicom.messaging.message.requests;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;

public class BootstrapOperationRequest extends BasicMessage{
	
	private String version;

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public BootstrapOperationRequest(){
		this.setMessageNumber(5);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
