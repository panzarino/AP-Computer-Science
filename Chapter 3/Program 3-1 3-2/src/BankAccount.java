/*
 * Zach Panzarino
 * 9/29/15
 * Program 3.1 & 3.2 - Class to simulate bank account with basic methods (deposit, withdraw, etc.)
 */

public class BankAccount {
	private double balance;
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(double initialBalance){
		balance = initialBalance;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public double getBalance(){
		return balance;
	}
	public void addInterest(double rate){
		balance+=balance*(rate*.01);
	}
}
