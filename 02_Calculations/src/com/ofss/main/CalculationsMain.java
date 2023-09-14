package com.ofss.main;

import java.util.Scanner;

import com.ofss.util.CalculationUtility;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("main start");

		// calling method using object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		int number2 = scanner.nextInt();

		// Creating object
		CalculationUtility calculationUtility = new CalculationUtility(number1, number2);

		//calculationUtility.accept(number1, number2);
		calculationUtility.calculate();
		int result = calculationUtility.display();
		System.out.println("Result is :: " + result);
		System.out.println("main end");
	}
}
