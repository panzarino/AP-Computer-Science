/*
 * Zach Panzarino
 * 9/29/15
 * Program 3.1 & 3.2 - tests the methods of the BankAccount class
 */

public class BankAccountTester {
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		bank.deposit(1000);
		bank.withdraw(500);
		bank.withdraw(400);
		System.out.println("The bank account has a balance of $"+bank.getBalance());
		System.out.println("Expected output: $100.0");
		System.out.println();
		BankAccount momsSavings = new BankAccount(1000);
		momsSavings.addInterest(10);
		System.out.println("Mom's savings bank account value: $"+momsSavings.getBalance());
		System.out.print("Expected output: $1100.0");
	}
}

/* Program Output
The bank account has a balance of $100.0
Expected output: $100.0

Mom's savings bank account value: $1100.0
Expected output: $1100.0
*/