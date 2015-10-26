/*
 * Zach Panzarino
 * 10/22/15
 * Program 4.17 - tests the month class
 */

import java.util.Scanner;
public class MonthTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of the month: ");
		int num = scan.nextInt();
		Month month = new Month(num);
		System.out.println("The month is: "+month.getName());
		System.out.println("Expected output test 1: May");
		System.out.println("Expected output test 2: August");
		System.out.println("Expected output test 3: January");
	}
}

/* Program Output
Enter the number of the month: 5
The month is: May
Expected output test 1: May
Expected output test 2: August
Expected output test 3: January

Enter the number of the month: 8
The month is: August
Expected output test 1: May
Expected output test 2: August
Expected output test 3: January

Enter the number of the month: 1
The month is: January
Expected output test 1: May
Expected output test 2: August
Expected output test 3: January
*/