package com.communicom.messaging.messages.responses;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;
import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends BasicMessage{

	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}
	
	public SetWaitForSignalResponse(){
		this.setMessageNumber(4);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
