package com.ofss.domain;

public class Savings extends Account {
	private boolean isOfTypeSalary;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance, boolean isOfTypeSalary) {
		super(accountNumber, name, balance);
		this.isOfTypeSalary = isOfTypeSalary;
		System.out.println("Overloaded constructor of Savings");
	}

	@Override // Function overriding as withdraw method is present in parent class
	public boolean withdraw(double amount) {
		if (amount > 0 && isOfTypeSalary && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && isOfTypeSalary == false && getBalance() - amount >= 1500) {
			setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	// getter and setter for isOfTypeSalary
	public boolean isOfTypeSalary() {
		return isOfTypeSalary;
	}

	public void setOfTypeSalary(boolean isOfTypeSalary) {
		this.isOfTypeSalary = isOfTypeSalary;
	}

}
