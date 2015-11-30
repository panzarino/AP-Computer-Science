/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.6 - tests the grade converter
 */

import java.util.Scanner;
public class GradeTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numeric grade: ");
		double g = scan.nextDouble();
		Grade grade = new Grade(g);
		System.out.println("Letter grade: "+grade.getLetterGrade());
		System.out.println("Test 1 expected results: A");
		System.out.println("Test 2 expected results: B+");
		System.out.println("Test 3 expected results: B-");
		System.out.println("Test 4 expected results: C");
		System.out.println("Test 5 expected results: D+");
		System.out.println("Test 6 expected results: F");
		System.out.println("Test 7 & 8 expected results: Invalid grade entered");
	}
}

/* Program Output
Enter the numeric grade: 4
Letter grade: A
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 4
Letter grade: A
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 2.8
Letter grade: B-
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 2
Letter grade: C
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 1.499999
Letter grade: D+
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 0
Letter grade: F
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: -1
Letter grade: Invalid grade entered
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered

Enter the numeric grade: 5
Letter grade: Invalid grade entered
Test 1 expected results: A
Test 2 expected results: B+
Test 3 expected results: B-
Test 4 expected results: C
Test 5 expected results: D+
Test 6 expected results: F
Test 7 & 8 expected results: Invalid grade entered
*/