package com.ofss.domain;

public class Demo extends Object {
	String text;

	public Demo(String text) {
		this.text = text;
		System.out.println(text);
	}

	public void show() {
		System.out.println("Hello");
	}

	@Override
	public boolean equals(Object obj) {
		Demo demo = (Demo) obj;
		boolean result = demo.text.equals(this.text);
		System.out.println("Comparison result =" + result);
		return result;
	}
}
