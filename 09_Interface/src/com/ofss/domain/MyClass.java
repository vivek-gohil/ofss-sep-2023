package com.ofss.domain;

//multiple inheritance
public class MyClass implements MyInteface, YourInteface {

	@Override
	public void show() {
		System.out.println("Hi");
	}

	@Override
	public void display() {
		System.out.println("Hello");
	}

}
