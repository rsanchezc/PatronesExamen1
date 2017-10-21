package com.communicom.messaging.message.factory;

import com.communicom.messaging.message.basic.BasicMessage;
import com.communicom.messaging.message.requests.BootstrapOperationRequest;
import com.communicom.messaging.message.requests.PingServerRequest;
import com.communicom.messaging.message.requests.SetWaitForSignalRequest;
import com.communicom.messaging.messages.responses.BootstrapOperationResponse;
import com.communicom.messaging.messages.responses.PingServerResponse;
import com.communicom.messaging.messages.responses.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.SignalType;

public class messageFactory {

	public static BasicMessage createMessage(SignalType ptype) throws Exception {

		switch(ptype){
		
		case PingServerRequest:
			return new PingServerRequest();
		case PingServerResponse:
			return new PingServerResponse();
		case SetWaitForSignalRequest:
			return new SetWaitForSignalRequest();
		case SetWaitForSignalResponse:
			return new SetWaitForSignalResponse();
		case BootstrapOperationRequest:
			return new BootstrapOperationRequest();
		case BootstrapOperationResponse:
			return new BootstrapOperationResponse();
		default:
			throw new Exception ("Error creating type of message");
		}
		
	}
	
}
