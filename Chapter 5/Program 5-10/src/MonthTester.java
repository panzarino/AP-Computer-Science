/*
 * Zach Panzarino
 * 11/11/15
 * Program 5.10 - tests the month class
 */

import java.util.Scanner;
public class MonthTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		int month = scan.nextInt();
		Month m = new Month(month);
		if (m.getDays()==0)
			System.out.println("Incorrect month entered");
		else
			System.out.println("There are "+m.getDays()+" days in month "+month);
		System.out.println("Tests 1-3 expected results: 31");
		System.out.println("Tests 4-5 expected results: 30");
		System.out.println("Test 6 expected results: 28");
		System.out.println("Test 7 expected results: Incorrect month entered");
	}
}

/* Program Output
Enter a month (1-12): 1
There are 31 days in month 1
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 3
There are 31 days in month 3
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 12
There are 31 days in month 12
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 4
There are 30 days in month 4
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 9
There are 30 days in month 9
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 2
There are 28 days in month 2
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered

Enter a month (1-12): 13
Incorrect month entered
Tests 1-3 expected results: 31
Tests 4-5 expected results: 30
Test 6 expected results: 28
Test 7 expected results: Incorrect month entered
*/