package com.communicom.messaging.message.basic;

import java.time.LocalDateTime;

public class BasicMessage {
	
	protected String messageName;
	protected int messageNumber;
	protected String sourceAddress;
	protected String targetAddress;
	protected LocalDateTime emisionTime;
	
	public String getNombre() {
		return messageName;
	}
	public void setNombre(String messageName) {
		this.messageName = messageName;
	}
	
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	@Override
	public String toString() {
		return "Message Name: " + this.getClass().getSimpleName()
				+ ", Number:" + messageNumber
				+ ", Emision Time:" + emisionTime;
	}
	
}
