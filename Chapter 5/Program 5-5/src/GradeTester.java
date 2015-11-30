/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.5 - tests the grading class
 */

import java.util.Scanner;
public class GradeTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the letter grade: ");
		String g = scan.next();
		Grade grade = new Grade(g);
		System.out.println("Numeric value: "+grade.getNumericGrade());
		System.out.println("Test 1 expected output: 4.0");
		System.out.println("Test 2 expected output: 3.7");
		System.out.println("Test 3 expected output: 3.0");
		System.out.println("Test 4 expected output: 3.3");
		System.out.println("Test 5 expected output: 1.7");
		System.out.println("Test 6 expected output: 0");
		System.out.println("Test 7 expected output: Invalid Grade Entered");
	}
}

/* Program Output
Enter the letter grade: A+
Numeric value: 4.0
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: A-
Numeric value: 3.7
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: B
Numeric value: 3.0
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: B+
Numeric value: 3.3
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: C-
Numeric value: 1.7
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: F
Numeric value: 0.0
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered

Enter the letter grade: E
Numeric value: Invalid grade entered
Test 1 expected output: 4.0
Test 2 expected output: 3.7
Test 3 expected output: 3.0
Test 4 expected output: 3.3
Test 5 expected output: 1.7
Test 6 expected output: 0
Test 7 expected output: Invalid Grade Entered
*/