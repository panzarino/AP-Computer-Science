/*
 * Zach Panzarino
 * 11/11/15
 * Program 5.12 - extra credit - tests the enhanced bank account class
 */

import java.util.Scanner;
public class BankAccountTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter initial balance: ");
		double initial = scan.nextDouble();
		BankAccount bank = new BankAccount(initial);
		System.out.print("Enter amount to deposit: ");
		System.out.println(bank.deposit(scan.nextDouble()));
		System.out.printf("Current balance: $%.2f\n", bank.getBalance());
		System.out.print("Enter amount to withdraw: ");
		System.out.println(bank.withdraw(scan.nextDouble()));
		System.out.printf("Current balance: $%.2f\n", bank.getBalance());
		System.out.print("Enter amount to deposit: ");
		System.out.println(bank.deposit(scan.nextDouble()));
		System.out.printf("Current balance: $%.2f\n", bank.getBalance());
		System.out.print("Enter amount to withdraw: ");
		System.out.println(bank.withdraw(scan.nextDouble()));
		System.out.printf("Current balance: $%.2f\n", bank.getBalance());
		System.out.println("All tests expected final balance: $100.00");
	}
}

/* Program Output
Enter initial balance: 0
Enter amount to deposit: 100
Completed
Current balance: $100.00
Enter amount to withdraw: -10
Cannot withdraw a negative amount
Current balance: $100.00
Enter amount to deposit: -20
Cannot deposit a negative amount
Current balance: $100.00
Enter amount to withdraw: 200
Cannot withdraw more than the current balance
Current balance: $100.00
All tests expected final balance: $100.00

Enter initial balance: 200
Enter amount to deposit: 100
Completed
Current balance: $300.00
Enter amount to withdraw: 400
Cannot withdraw more than the current balance
Current balance: $300.00
Enter amount to deposit: 100
Completed
Current balance: $400.00
Enter amount to withdraw: 300
Completed
Current balance: $100.00
All tests expected final balance: $100.00

Enter initial balance: 100
Enter amount to deposit: 100
Completed
Current balance: $200.00
Enter amount to withdraw: 200
Completed
Current balance: $0.00
Enter amount to deposit: 100
Completed
Current balance: $100.00
Enter amount to withdraw: -10
Cannot withdraw a negative amount
Current balance: $100.00
All tests expected final balance: $100.00
*/