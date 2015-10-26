/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.4 - gives statistics about a pair of numbers
 */

public class Pair {
	private double num1;
	private double num2;
	public Pair(double n1, double n2){
		num1 = n1;
		num2 = n2;
	}
	public double getSum(){
		return num1+num2;
	}
	public double getDifference(){
		return num1-num2;
	}
	public double getProduct(){
		return num1*num2;
	}
	public double getAverage(){
		return (num1+num2)/2;
	}
	public double getDistance(){
		return Math.abs(num1-num2);
	}
	public double getMax(){
		return Math.max(num1, num2);
	}
	public double getMin(){
		return Math.min(num1, num2);
	}
}
