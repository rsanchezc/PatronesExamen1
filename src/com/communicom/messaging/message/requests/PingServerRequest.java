package com.communicom.messaging.message.requests;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;

public class PingServerRequest extends BasicMessage{
	
	public PingServerRequest(){
		this.setMessageNumber(1);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
