/*
 * Zach Panzarino
 * 2/29/15
 * Program 3.3 - creates a savings bank account
 */

public class SavingsAccount {
	private double balance;
	private double interest;
	public SavingsAccount(double initialBalance, double rate){
		balance = initialBalance;
		interest = rate*.01;
	}
	public SavingsAccount(){
		balance = 0;
		interest = 0;
	}
	public void addInterest(){
		balance += balance*interest;
	}
	public double getBalance(){
		return balance;
	}
	public double getInterest(){
		return interest*100;
	}
}