/*
 * Zach Panzarino
 * 10/2/15
 * Project 3.1 - tests the advanced bank account class
 */

public class BankAccountTester {
	public static void main(String[] args){
		BankAccount b1 = new BankAccount(1000, 1);
		b1.withdraw(100);
		b1.deposit(200);
		b1.withdraw(15);
		System.out.println("Fee Charged Per Transaction Results:\n");
		System.out.println("Account Balance: $"+b1.getBalance());
		System.out.println("Expected Balance: $1082.0\n");
		System.out.println("======================================\n");
		System.out.println("Monthly Fee Charged Results:\n");
		BankAccount b2 = new BankAccount(1000, 2, 3);
		b2.withdraw(100);
		b2.deposit(20);
		b2.withdraw(150);
		b2.deposit(12);
		b2.deposit(38);
		b2.deductMonthly();
		System.out.println("Balance after first month: $"+b2.getBalance());
		System.out.println("Expected balance after first month: $816.0");
		System.out.println("-------------------------------------------");
		b2.withdraw(210);
		b2.deposit(20);
		b2.withdraw(108);
		b2.deposit(122);
		b2.deposit(32);
		b2.deposit(300);
		b2.deductMonthly();
		System.out.println("Balance after second month: $"+b2.getBalance());
		System.out.println("Expected balance after second month: $966.0");
		System.out.println("-------------------------------------------");
		b2.withdraw(120);
		b2.deposit(80);
		b2.deductMonthly();
		System.out.println("Balance after third month: $"+b2.getBalance());
		System.out.println("Expected balance after third month: $926.0");
	}
}

/* Program Output
Fee Charged Per Transaction Results:

Account Balance: $1082.0
Expected Balance: $1082.0

======================================

Monthly Fee Charged Results:

Balance after first month: $816.0
Expected balance after first month: $816.0
-------------------------------------------
Balance after second month: $966.0
Expected balance after second month: $966.0
-------------------------------------------
Balance after third month: $926.0
Expected balance after third month: $926.0
*/