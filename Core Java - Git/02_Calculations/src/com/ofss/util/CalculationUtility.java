package com.ofss.util;

import java.util.Scanner;

public class CalculationUtility {
	private int number1;
	private int number2;
	private int result;

	public CalculationUtility() {
		System.out.println("Constructor Called : CalculationUtility");
	}
	
	public CalculationUtility(int number1 , int number2) {
		System.out.println("Overloaded Constructor Called : CalculationUtility");
		this.number1 = number1;
		this.number2 = number2;
	}

	public void accept(int number1, int number2) {
		System.out.println("accept() of CalculationUtility");
		this.number1 = number1;
		this.number2 = number2;
	}

	public void calculate() {
		System.out.println("calculate() of CalculationUtility");
		result = number1 + number2;
	}

	public int display() {
		System.out.println("display() of CalculationUtility");
		return result;
		// System.out.println("Addition of " + number1 + " and " + number2 + " is " +
		// result);
	}
}
