/*
 * Zach Panzarino
 * 10/19/15
 * Program 4.12 - tests the digit extractor class
 */

import java.util.Scanner;
public class DigitExtractorTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to be broken apart: ");
		int num = scan.nextInt();
		DigitExtractor digits = new DigitExtractor(num);
		System.out.println(digits.nextDigit());
		System.out.println(digits.nextDigit());
		System.out.println(digits.nextDigit());
		System.out.println(digits.nextDigit());
		System.out.println(digits.nextDigit());
		System.out.println("Expected output: 5 4 3 2 1 (All on new lines)");
	}
}

/* Program Output
Enter the number to be broken apart: 12345
5
4
3
2
1
Expected output: 5 4 3 2 1 (All on new lines)
*/