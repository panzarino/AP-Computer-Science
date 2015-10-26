/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.4 - tests the pair statistics class
 */

import java.util.Scanner;
public class PairTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scan.nextDouble();
		Pair pair = new Pair(num1, num2);
		System.out.println("Your numbers are "+num1+" and "+num2);
		System.out.println("The sum is "+pair.getSum());
		System.out.println("The difference is "+pair.getDifference());
		System.out.println("The product is "+pair.getProduct());
		System.out.println("The average is "+pair.getAverage());
		System.out.println("The distance is "+pair.getDistance());
		System.out.println("The maximum is "+pair.getMax());
		System.out.println("The minimum is "+pair.getMin());
		System.out.println("Expected sum is 30.0");
		System.out.println("Expected difference is -10.0");
		System.out.println("Expected product is 200.0");
		System.out.println("Expected average is 15.0");
		System.out.println("Expected distance is 10.0");
		System.out.println("Expected maximum is 20.0");
		System.out.println("Expected minimum is 10.0");
	}
}

/* Program Output
Enter the first number: 10
Enter the second number: 20
Your numbers are 10.0 and 20.0
The sum is 30.0
The difference is -10.0
The product is 200.0
The average is 15.0
The distance is 10.0
The maximum is 20.0
The minimum is 10.0
Expected sum is 30.0
Expected difference is -10.0
Expected product is 200.0
Expected average is 15.0
Expected distance is 10.0
Expected maximum is 20.0
Expected minimum is 10.0
*/