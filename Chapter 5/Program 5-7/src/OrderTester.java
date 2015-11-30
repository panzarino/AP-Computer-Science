/*
 * Zach Panzarino
 * 11/10/15
 * Program 5.7 - tests the lexicographic order
 */

import java.util.Scanner;
public class OrderTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three strings: ");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = scan.nextLine();
		Order order = new Order(s1, s2, s3);
		System.out.println("The inputs in sorted order are: ");
		System.out.println(order.first());
		System.out.println(order.middle());
		System.out.println(order.last());
		System.out.println("Tests 1-3 expected output: aaa aab aac");
		System.out.println("Test 4 expected output: AAa Aaa aaa");
		System.out.println("Test 5 expected output: AAA aaa aab");
		System.out.println("Test 6 expected output: aaa aaa aaa");
	}
}

/* Program Output
Enter three strings: 
aaa
aab
aac
The inputs in sorted order are: 
aaa
aab
aac
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa

Enter three strings: 
aac
aab
aaa
The inputs in sorted order are: 
aaa
aab
aac
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa

Enter three strings: 
aab
aac
aaa
The inputs in sorted order are: 
aab
aaa
aac
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa

Enter three strings: 
aaa
AAa
Aaa
The inputs in sorted order are: 
AAa
Aaa
aaa
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa

Enter three strings: 
aab
aaa
AAA
The inputs in sorted order are: 
AAA
aaa
aab
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa

Enter three strings: 
aaa
aaa
aaa
The inputs in sorted order are: 
aaa
aaa
aaa
Tests 1-3 expected output: aaa aab aac
Test 4 expected output: AAa Aaa aaa
Test 5 expected output: AAA aaa aab
Test 6 expected output: aaa aaa aaa
*/