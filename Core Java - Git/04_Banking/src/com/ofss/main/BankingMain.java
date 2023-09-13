package com.ofss.main;

import com.ofss.domain.Account;

public class BankingMain {
	public static void main(String[] args) {
		System.out.println("main start");

		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Rohan");
		account.setBalance(1000);

		System.out.println("account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());

		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Niraj");
		account2.setBalance(1000);

		System.out.println("account Number = " + account2.getAccountNumber());
		System.out.println("Name = " + account2.getName());
		System.out.println("Balance = " + account2.getBalance());

		System.out.println("main end");
	}
}
