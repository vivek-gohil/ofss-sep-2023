package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Account;
import com.ofss.domain.Savings;

public class BankingMainV3 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		Scanner scanner = new Scanner(System.in);
		int choice;
		double amount;
		boolean result;
		String continuechoice;
		boolean isOfTypeSalary;
		
		System.out.println("Enter account opening details");
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account(true or false)");
		isOfTypeSalary=scanner.nextBoolean();

//		Account account = new Account(accountNumber, name, balance);
		Savings account = new Savings(accountNumber, name, balance, isOfTypeSalary);

		System.out.println("Account opend successfully!");
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Depsit");
			System.out.println("3. Balance");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You have selected withdraw");
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result == true)
					System.out.println("Transaction Successful!");
				else {
					System.out.println("Transaction Failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 2:
				System.out.println("You have selected deposit");
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result == true)
					System.out.println("Transaction Successful!");
				else {
					System.out.println("Transaction Failed!");
					System.out.println("Balance :: " + account.getBalance());
				}
				break;
			case 3:
				System.out.println("Your balance : " + account.getBalance());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue?yes-no");
			continuechoice = scanner.next();
		} while (continuechoice.equals("yes"));

	}
}
