/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.4 - tests the yes no checker class
 */

import java.util.Scanner;
public class YesNoCheckerTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		YesNoChecker check = new YesNoChecker();
		System.out.print("Do you want to continue? ");
		String input = scan.nextLine();
		System.out.println(check.Check(input));
		System.out.println("Tests 1-5 expected output: OK");
		System.out.println("Tests 6-7 expected output: Terminating");
		System.out.println("Test 8 expected output: Bad input");
	}
}

/* Program Output
Do you want to continue? Y
OK
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? yEs
OK
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? suRE
OK
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? OK
OK
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? wHy NOt?
OK
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? n
Terminating
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? No
Terminating
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input

Do you want to continue? sjdbflkushfs
Bad input
Tests 1-5 expected output: OK
Tests 6-7 expected output: Terminating
Test 8 expected output: Bad input
*/