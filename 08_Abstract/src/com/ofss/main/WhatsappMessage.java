package com.ofss.main;

public class WhatsappMessage extends Message {
	// Function overriding
	public void sendMessage() {
		System.out.println("Sending WhatsappMessage!");
	}

	@Override
	public void readMessage() {
		System.out.println("Blue tickmark");
		System.out.println("Read WhatsappMessage");
	}
}
