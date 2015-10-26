/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.11 - tests the cash register class
 */

public class CashRegisterTester {
	public static void main(String[] args){
		CashRegister register = new CashRegister();
		register.recordPurchase(9.34);
		register.recordPurchase(123);
		register.recordPurchase(45.23);
		register.enterPayment(175,25,30,12,15);
		System.out.println("Change in dollars: "+register.giveDollars());
		System.out.println("Change in quarters: "+register.giveQuarters());
		System.out.println("Change in dimes: "+register.giveDimes());
		System.out.println("Change in nickels: "+register.giveNickels());
		System.out.println("Change in pennies: "+register.givePennies());
		System.out.println("Expected dollar change: 7");
		System.out.println("Expected quarter change: 1");
		System.out.println("Expected dime change: 1");
		System.out.println("Expected nickel change: 1");
		System.out.println("Expected pennies change: 3");
	}
}

/* Program Output
Change in dollars: 7
Change in quarters: 1
Change in dimes: 1
Change in nickels: 1
Change in pennies: 3
Expected dollar change: 7
Expected quarter change: 1
Expected dime change: 1
Expected nickel change: 1
Expected pennies change: 3
*/