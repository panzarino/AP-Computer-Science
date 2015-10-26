/*
 * Zach Panzarino
 * 10/14/15
 * Program 4.1 - tests cash register class
 */

public class CashRegisterTester {
	public static void main(String[] args){
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.enterDollars(20);
		register.enterQuarters(2);
		register.enterDimes(4);
		register.enterNickels(5);
		register.enterPennies(20);
		System.out.printf("Change: $%.2f%n", register.giveChange());
		System.out.println("Expected Change: $0.98");
	}
}

/* Program Output
Change: $0.98
Expected Change: $0.98
*/