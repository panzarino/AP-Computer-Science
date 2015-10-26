/*
 * Zach Panzarino
 * 10/14/15
 * Program 4.2 - tests enhanced cash register class
 */

public class CashRegisterTester {
	public static void main(String[] args){
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.recordPurchase(1.92);
		register.recordPurchase(12.24);
		register.enterDollars(25);
		register.enterQuarters(22);
		register.enterDimes(34);
		register.enterNickels(12);
		register.enterPennies(23);
		System.out.printf("Change for "+register.getItemCount()+" items: $%.2f%n", register.giveChange());
		System.out.println("Expected Items: 3");
		System.out.println("Expected Change: $0.20");
	}
}

/* Program Output
Change for 3 items: $0.20
Expected Items: 3
Expected Change: $0.20
*/