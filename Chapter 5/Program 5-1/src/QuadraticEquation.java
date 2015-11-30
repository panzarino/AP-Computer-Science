/*
 * Zach Panzarino
 * 11/3/15
 * Program 5.1 - more complex quadratic equation evaluation
 */

public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double sa, double sb, double sc){
		a = sa;
		b = sb;
		c = sc;
	}
	public boolean hasSolutions(){
		if (Math.pow(b, 2)-4*a*c >= 0)
			return true;
		else
			return false;
	}
	public double getSolution1(){
		if (Math.pow(b, 2)-4*a*c >= 0)
			return (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		else
			return 0;
	}
	public double getSolution2(){
		if (Math.pow(b, 2)-4*a*c >= 0)
			return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		else
			return 0;
	}
}
