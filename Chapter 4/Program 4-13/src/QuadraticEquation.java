/*
 * Zach Panzarino
 * 10/20/15
 * Program 4.13 - uses the quadratic equation
 */

public class QuadraticEquation {
	private double a, b, c;
	public QuadraticEquation(double aval, double bval, double cval){
		a=aval;
		b=bval;
		c=cval;
	}
	public double getSolution1(){
		return (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	}
	public double getSolution2(){
		return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	}
}
