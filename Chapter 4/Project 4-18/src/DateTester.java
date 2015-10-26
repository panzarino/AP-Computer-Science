/*
 * Zach Panzarino
 * 10/26/15
 * Program 4.18 - tests the easter class
 */

import java.util.Scanner;
public class DateTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year to find Easter: ");
		int year = scan.nextInt();
		Date easter = new Date(year);
		easter.calculate();
		System.out.println("Easter in "+year+" is "+easter.getEasterSundayMonth()+" "+easter.getEasterSundayDay());
		System.out.println("Expected date for test 1: April 15");
		System.out.println("Expected date for test 2: March 27");
	}
}

/* Program Output
Enter the year to find Easter: 2001
Easter in 2001 is April 15
Expected date for test 1: April 15
Expected date for test 2: March 27

Enter the year to find Easter: 2016
Easter in 2016 is March 27
Expected date for test 1: April 15
Expected date for test 2: March 27
*/