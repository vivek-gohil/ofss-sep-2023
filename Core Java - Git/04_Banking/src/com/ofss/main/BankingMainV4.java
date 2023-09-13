package com.ofss.main;

import com.ofss.domain.Current;

public class BankingMainV4 {
	public static void main(String[] args) {
		Current current = new Current(101, "Testing", 10000, 50000);
		boolean result;
		System.out.println("withdraw : 5000");
		result = current.withdraw(5000);
		System.out.println("Result = " + result); // true
		System.out.println("Balance ::" + current.getBalance()); // 5000
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance()); // 500000

		System.out.println();

		System.out.println("withdraw : 10000");
		result = current.withdraw(10000);
		System.out.println("Result = " + result); // true
		System.out.println("Balance ::" + current.getBalance()); // 0
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance()); // 45000

		System.out.println();

		System.out.println("withdraw : 5000");
		result = current.withdraw(5000);
		System.out.println("Result = " + result); // true
		System.out.println("Balance ::" + current.getBalance()); // 0
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance()); // 40000

		System.out.println();

		System.out.println("deposit : 5000");
		result = current.deposit(5000);
		System.out.println("Result = " + result); // true
		System.out.println("Balance ::" + current.getBalance()); // 0
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance()); // 45000

		System.out.println();

		System.out.println("deposit : 20000");
		result = current.deposit(20000);
		System.out.println("Result = " + result); // true
		System.out.println("Balance ::" + current.getBalance()); // 15000
		System.out.println("Overdraft Balance :: " + current.getOverdraftBalance()); // 50000

	}
}
