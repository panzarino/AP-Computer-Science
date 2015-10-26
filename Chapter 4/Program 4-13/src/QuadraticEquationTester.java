/*
 * Zach Panzarino
 * 10/20/15
 * Program 4.13 - tests the quadratic equation class
 */

import java.util.Scanner;
public class QuadraticEquationTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the a value: ");
		double a = scan.nextDouble();
		System.out.print("Enter the b value: ");
		double b = scan.nextDouble();
		System.out.print("Enter the c value: ");
		double c = scan.nextDouble();
		QuadraticEquation e = new QuadraticEquation(a,b,c);
		System.out.println("Solution 1: "+e.getSolution1());
		System.out.println("Solution 2: "+e.getSolution2());
		System.out.println("Expected solution 1 for test 1: 1.35");
		System.out.println("Expected solution 2 for test 1: -1.85");
		System.out.println("Expected solution 1 for test 2: NaN");
		System.out.println("Expected solution 2 for test 2: NaN");
		System.out.println("Expected solution 2 for test 3: -.5");
		System.out.println("Expected solution 2 for test 3: -.5");
		System.out.println("If the result is not a real number, NaN will be displayed.");
	}
}

/* Program Output
Enter the a value: 2
Enter the b value: 1
Enter the c value: -5
Solution 1: 1.3507810593582121
Solution 2: -1.8507810593582121
Expected solution 1 for test 1: 1.35
Expected solution 2 for test 1: -1.85
Expected solution 1 for test 2: NaN
Expected solution 2 for test 2: NaN
Expected solution 2 for test 3: -.5
Expected solution 2 for test 3: -.5
If the result is not a real number, NaN will be displayed.

Enter the a value: 12
Enter the b value: 12
Enter the c value: 12
Solution 1: NaN
Solution 2: NaN
Expected solution 1 for test 1: 1.35
Expected solution 2 for test 1: -1.85
Expected solution 1 for test 2: NaN
Expected solution 2 for test 2: NaN
Expected solution 2 for test 3: -.5
Expected solution 2 for test 3: -.5
If the result is not a real number, NaN will be displayed.

Enter the a value: 4
Enter the b value: 4
Enter the c value: 1
Solution 1: -0.5
Solution 2: -0.5
Expected solution 1 for test 1: 1.35
Expected solution 2 for test 1: -1.85
Expected solution 1 for test 2: NaN
Expected solution 2 for test 2: NaN
Expected solution 2 for test 3: -.5
Expected solution 2 for test 3: -.5
If the result is not a real number, NaN will be displayed.
*/