package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.message.basic.BasicMessage;
import com.communicom.messaging.message.factory.messageFactory;
import com.communicom.messaging.messages.signals.SignalType;

public class MessageController {

	private static ArrayList<BasicMessage> messageList = new ArrayList<BasicMessage>();
	
	public void sendMessage(int messageOption) throws Exception {
		messageList.add(createMessage(SignalType.values()[messageOption-1]));
	}
	
	public BasicMessage createMessage(SignalType pOption) throws Exception {
		return messageFactory.createMessage(pOption);
	}

	public void listMessage(){
		for (BasicMessage oneMessage: messageList){
			System.out.println(oneMessage);
		}
	}

}
