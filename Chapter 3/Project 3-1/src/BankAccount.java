/*
 * Zach Panzarino
 * 10/2/15
 * Project 3.1 - class to create advanced bank account
 */

public class BankAccount {
	private double balance;
	private double fee;
	private double free;
	private double count;
	private double endfee;
	public BankAccount(){
		balance = 0;
		fee = 0;
		free = 0;
		count = 0;
	}
	public BankAccount(double initialBalance){
		balance = initialBalance;
		fee = 0;
		free = 0;
		count = 0;
		endfee = 0;
	}
	public BankAccount(double initialBalance, double amount){
		balance = initialBalance;
		fee = amount;
		free = 0;
		count = 0;
		endfee = 0;
	}
	public BankAccount(double initialBalance, double amount, double numFree){
		balance = initialBalance;
		fee = 0;
		free = numFree;
		count = 0;
		endfee = amount;
	}
	public void deposit(double amount){
		balance += amount;
		balance -= fee;
		count++;
	}
	public void withdraw(double amount){
		balance -= amount;
		balance -= fee;
		count++;
	}
	public double getBalance(){
		return balance;
	}
	public void deductMonthly(){
		if(count>free){
			balance-=((count-free)*endfee);
		}
		count=0;
	}
}
