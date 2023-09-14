package com.ofss.main;

public class MessageMain {
	public static void main(String[] args) {
		// Message message = new Message();
		Message message = new WhatsappMessage();
		message.sendMessage();
		message.readMessage();
		
	}
}
