package com.communicom.messaging.messages.responses;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;

public class PingServerResponse extends BasicMessage{
	
	public PingServerResponse(){
		this.setMessageNumber(2);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
