package com.communicom.messaging.messages.responses;

import java.time.LocalDateTime;

import com.communicom.messaging.message.basic.BasicMessage;

public class BootstrapOperationResponse extends BasicMessage{

	private String version;
	private int result;
	private int errorMessage;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(int errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public void SetResultSuccess(){
		this.setResult(0);
	}
	
	public void SetResultFailure(){
		this.setResult(1);
	}
	
	public void SetErrorMessageEmpty(){
		this.setErrorMessage(0);
	}
	public void SetErrorMessageExist(){
		this.setErrorMessage(1);
	}
	
	public BootstrapOperationResponse(){
		this.setMessageNumber(6);
		this.setEmisionTime(LocalDateTime.now());
	}
	
}
