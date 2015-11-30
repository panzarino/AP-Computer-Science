/*
 * Zach Panzarino
 * 11/11/15
 * Program 5.12 - extra credit - bank account that provides errors if values are incorrect
 */

public class BankAccount {
	private double balance;
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(double initialBalance){
		balance = initialBalance;
	}
	public String deposit(double amount){
		if (amount>=0){
			balance += amount;
			return "Completed";
		}
		else
			return "Cannot deposit a negative amount";
	}
	public String withdraw(double amount){
		if (amount<0)
			return "Cannot withdraw a negative amount";
		else {
			if (balance-amount>=0){
				balance -= amount;
				return "Completed";
			}
			else
				return "Cannot withdraw more than the current balance";
		}
	}
	public double getBalance(){
		return balance;
	}
}
