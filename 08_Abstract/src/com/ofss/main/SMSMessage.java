package com.ofss.main;

public class SMSMessage extends Message {

	@Override
	public void sendMessage() {
		System.out.println("Sending SMSMessge");
	}
	
	@Override
	public void readMessage() {
		System.out.println("Reading SMSMessage");
	}
}
