package Phalap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account{
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		return accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int setAccountPin(int accountPin) {
		this.accountPin = accountPin;
		return accountPin;
	}
	
	public int getAccountPin() {
		return accountPin;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}

	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: "  + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Insufficient Funds." + "\n");
		}
	}

	private void calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);

	}

	public void getSavingWithdrawalInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " + savingBalance + "\n");
	} else {
		System.out.println("Balance cannot be negative." + "\n");
	}
}
	
	private void calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		
	}

	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposits(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
	} else {
		System.out.println("Balance cannot be negative." + "\n");
	}
}
	private void calcCheckingDeposits(double amount) {
		checkingBalance = (checkingBalance + amount);
	}

	public void getSavingDepositInput() {
		System.out.println("Saving Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposits(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
	} else {
		System.out.println("Balance cannot be negative." + "\n");
	}
}
	private void calcSavingDeposits(double amount) {

		savingBalance = (savingBalance + amount);

	}
	private int accountNumber;
	private int accountPin;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
}
