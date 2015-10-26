/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.11 - modified cash register to compute change and record purchases
 */

public class CashRegister {
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	private double change;
	public CashRegister(){
		change = 0;
	}
	public void recordPurchase(double amount){
		change -= amount;
	}
	public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies){
		double val=dollars+quarters*QUARTER_VALUE+dimes*DIME_VALUE+nickels*NICKEL_VALUE+pennies*PENNY_VALUE;
		change+=val;
	}
	public int giveDollars(){
		int val = (int)(change);
		change-=val;
		return val;
	}
	public int giveQuarters(){
		int val = (int)((change)/QUARTER_VALUE);
		change-=val*QUARTER_VALUE;
		return val;
	}
	public int giveDimes(){
		int val = (int)((change)/DIME_VALUE);
		change-=val*DIME_VALUE;
		return val;
	}
	public int giveNickels(){
		int val = (int)((change)/NICKEL_VALUE);
		change-=val*NICKEL_VALUE;
		return val;
	}
	public int givePennies(){
		int val = (int)((change)/PENNY_VALUE);
		change-=val*PENNY_VALUE;
		return val;
	}
}
