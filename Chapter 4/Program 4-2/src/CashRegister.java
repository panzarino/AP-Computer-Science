/*
 * Zach Panzarino
 * 10/14/15
 * Program 4.2 - cash register to total sales and compute change
 */

public class CashRegister {
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	private double purchase;
	private double payment;
	private int count;
	public CashRegister(){
		purchase = 0;
		payment = 0;
		count = 0;
	}
	public void recordPurchase(double amount){
		purchase += amount;
		count++;
	}
	public void enterDollars(int dollars){
		payment+=dollars;
	}
	public void enterQuarters(int quarters){
		payment+=quarters*QUARTER_VALUE;
	}
	public void enterDimes(int dimes){
		payment+=dimes*DIME_VALUE;
	}
	public void enterNickels(int nickels){
		payment+=nickels*NICKEL_VALUE;
	}
	public void enterPennies(int pennies){
		payment+=pennies*PENNY_VALUE;
	}
	public double giveChange(){
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		count = 0;
		return change;
	}
	public int getItemCount(){
		return count;
	}
}
