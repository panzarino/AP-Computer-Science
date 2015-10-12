/*
 * Zach Panzarino
 * 9/29/15
 * Program 3.3 - tests savings account class
 */

public class SavingsAccountTester {
	public static void main(String[] args){
		SavingsAccount mySavings = new SavingsAccount(1000,10);
		System.out.println("Balance before interest is applied: $"+mySavings.getBalance());
		System.out.println("Interest rate: "+mySavings.getInterest()+"%");
		mySavings.addInterest();
		System.out.println("Balance after interest is applied: $"+mySavings.getBalance());
		System.out.print("Expected balance: $1100.0");
	}
}

/* Program Output
Balance before interest is applied: $1000.0
Interest rate: 10.0%
Balance after interest is applied: $1100.0
Expected balance: $1100.0
*/