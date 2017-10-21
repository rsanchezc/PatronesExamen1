package com.communicom.messaging.message.requests;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;
import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends BasicMessage{
	
	private SignalType signal;
	private String signalValue;

	public SignalType getSignal() {
		return signal;
	}
	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}
	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
	public SetWaitForSignalRequest(){
		this.setMessageNumber(3);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
