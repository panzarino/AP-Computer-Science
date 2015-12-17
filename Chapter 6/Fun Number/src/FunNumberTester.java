/*
 * Zach Panzarino
 * 11/24/15
 * Fun Number - tests the fun numbers
 */

import java.util.Scanner;
public class FunNumberTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a fun number: ");
		int x = scan.nextInt();
		FunNumber num = new FunNumber(x);
		System.out.println("The fun number is "+num.getValue());
		System.out.println("Number of digits is "+num.numDigits());
		System.out.println("Sum of digits is "+num.sumDigits());
		System.out.println("Sum of all numbers less than or equal to the original number is "+num.sumInts());
		System.out.println("Factorial of the fun number is "+num.findFactorial());
		System.out.print("Factors of this number are ");
		num.printFactors();
		if (num.isPrime())
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
		if (num.isPerfect())
			System.out.println("The number is perfect");
		else
			System.out.println("The number is not perfect");
		System.out.println("The reverse of the number is "+num.reverseNum());
	}
}

/* Program Output
Enter a fun number: 123
The fun number is 123
Number of digits is 3
Sum of digits is 6
Sum of all numbers less than or equal to the original number is 7626
Factorial of the fun number is 0
Factors of this number are 1, 3, 41, 123
The number is not prime
The number is not perfect
The reverse of the number is 321

Enter a fun number: 6
The fun number is 6
Number of digits is 1
Sum of digits is 6
Sum of all numbers less than or equal to the original number is 21
Factorial of the fun number is 720
Factors of this number are 1, 2, 3, 6
The number is not prime
The number is perfect
The reverse of the number is 6

Enter a fun number: 28
The fun number is 28
Number of digits is 2
Sum of digits is 10
Sum of all numbers less than or equal to the original number is 406
Factorial of the fun number is -5968160532966932480
Factors of this number are 1, 2, 4, 7, 14, 28
The number is not prime
The number is perfect
The reverse of the number is 82

Enter a fun number: 482
The fun number is 482
Number of digits is 3
Sum of digits is 14
Sum of all numbers less than or equal to the original number is 116403
Factorial of the fun number is 0
Factors of this number are 1, 2, 241, 482
The number is not prime
The number is not perfect
The reverse of the number is 284
*/