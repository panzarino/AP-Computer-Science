/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.1 - creating a savings account
*/

public class SavingsAccount extends BankAccount {
    private double interestRate, min;
    public SavingsAccount(double rate){
        interestRate = rate;
        min = Double.MAX_VALUE;
    }
    public String withdraw(double amount){
		String message = super.withdraw(amount);
		min = Math.min(min, getBalance());
		return message;
	}
    public void addInterest(){
        double interest = min * interestRate / 100;
        deposit(interest);
        min = getBalance();
    }
    public double getMinimum(){
        return min;
    }
}