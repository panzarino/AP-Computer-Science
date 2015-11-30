/*
 * Zach Panzarino
 * 11/11/15
 * Program 5.13 - tests the paycheck class
 */

import java.util.Scanner;
public class PaycheckTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the wage of the employee: ");
		double wage = scan.nextDouble();
		System.out.print("Enter the hours worked by the employee: ");
		double hours = scan.nextDouble();
		Paycheck check = new Paycheck(wage, hours);
		System.out.printf("Amount to be payed to employee: $%.2f\n", check.getPay());
		System.out.println("Test 1 expected output: $144.00");
		System.out.println("Test 2 expected output: $345.00");
		System.out.println("Test 3 expected output: $875.00");
		System.out.println("Test 4 expected output: $167.60");
	}
}

/* Program Output
Enter the wage of the employee: 12
Enter the hours worked by the employee: 12
Amount to be payed to employee: $144.00
Test 1 expected output: $144.00
Test 2 expected output: $345.00
Test 3 expected output: $875.00
Test 4 expected output: $167.60

Enter the wage of the employee: 10
Enter the hours worked by the employee: 34.5
Amount to be payed to employee: $345.00
Test 1 expected output: $144.00
Test 2 expected output: $345.00
Test 3 expected output: $875.00
Test 4 expected output: $167.60

Enter the wage of the employee: 12.5
Enter the hours worked by the employee: 60
Amount to be payed to employee: $875.00
Test 1 expected output: $144.00
Test 2 expected output: $345.00
Test 3 expected output: $875.00
Test 4 expected output: $167.60

Enter the wage of the employee: 8.38
Enter the hours worked by the employee: 20
Amount to be payed to employee: $167.60
Test 1 expected output: $144.00
Test 2 expected output: $345.00
Test 3 expected output: $875.00
Test 4 expected output: $167.60
*/