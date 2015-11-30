/*
 * Zach Panzarino
 * 11/9/15
 * Program 5.3 - sorts 3 floating point numbers
 */

import java.util.Scanner;
public class SortTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		Sort sort = new Sort(num1, num2, num3);
		System.out.println(sort.getSmallest());
		System.out.println(sort.getMiddle());
		System.out.println(sort.getLargest());
		System.out.println("All tests expected results: 1 2 3");
		System.out.println("Last test expected results: 3 3 3");
	}
}

/* Program Output
Enter the three numbers: 
1
2
3
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
1
3
2
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
2
1
3
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
2
3
1
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
3
1
2
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
3
2
1
1.0
2.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3

Enter the three numbers: 
3
3
3
3.0
3.0
3.0
All tests expected results: 1 2 3
Last test expected results: 3 3 3
*/