package com.ofss.main;

public abstract class Message {
	public abstract void sendMessage();

	public abstract void readMessage();

//	public void readMessage() {
//		System.out.println("Reading Message");
//	}

	public void print() {
		System.out.println("Hi");
	}
}
