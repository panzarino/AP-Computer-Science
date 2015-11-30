/*
 * Zach Panzarino
 * 11/3/15
 * Program 5.1 - tests the quadratic equation class
 */

import java.util.Scanner;
public class QuadraticEquationTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();
		System.out.print("Enter b: ");
		double b = scan.nextDouble();
		System.out.print("Enter c: ");
		double c = scan.nextDouble();
		QuadraticEquation eqn = new QuadraticEquation(a, b, c);
		System.out.println("It is "+eqn.hasSolutions()+" that the equation has real solutions.");
		if (eqn.hasSolutions())
			System.out.println("The solutions are: "+eqn.getSolution1()+" and "+eqn.getSolution2());
		System.out.println("Test 1 expected output: no real solutions");
		System.out.println("Test 2 expected output: real solutions of 1.0 and -2.0");
	}
}

/* Program Output
Enter a: 12
Enter b: 12
Enter c: 12
It is false that the equation has real solutions.
Test 1 expected output: no real solutions
Test 2 expected output: real solutions of 1.0 and -2.0

Enter a: 1
Enter b: 1
Enter c: -2
It is true that the equation has real solutions.
The solutions are: 1.0 and -2.0
Test 1 expected output: no real solutions
Test 2 expected output: real solutions of 1.0 and -2.0
*/