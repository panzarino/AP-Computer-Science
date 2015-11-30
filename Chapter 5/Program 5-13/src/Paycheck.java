/*
 * Zach Panzarino
 * 11/11/15
 * Program 5.13 - determines how much to pay employees
 */

public class Paycheck {
	private double salary, hours;
	public Paycheck(double pay, double h){
		salary = pay;
		hours = h;
	}
	public double getPay(){
		double normal = hours, overtime = 0;
		if (hours>40){
			overtime = hours-40;
			normal = 40;
		}
		return (normal*salary) + (overtime*salary*1.5);
	}
}
