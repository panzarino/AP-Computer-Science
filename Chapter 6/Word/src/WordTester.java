/*
 * Zach Panzarino
 * 11/30/15
 * Word - tests the word class
 */

import java.util.Scanner;
public class WordTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = scan.next();
		Word word = new Word(s);
		System.out.println("Reverse of the word is: "+word.reverse());
		if (word.isPalindrome())
			System.out.println("Method 1 says it is a palindrome");
		else
			System.out.println("Method 1 says it is not a palindrome");
		if (word.isPalindrome2())
			System.out.println("Method 2 says it is a palindrome");
		else
			System.out.println("Method 2 says it is not a palindrome");
	}
}

/* Program Output
Enter a word: racecar
Reverse of the word is: racecar
Method 1 says it is a palindrome
Method 2 says it is a palindrome

Enter a word: word
Reverse of the word is: drow
Method 1 says it is not a palindrome
Method 2 says it is not a palindrome

Enter a word: qwertyuioplkjhgfdsazxcvbnmmnbvcxzasdfghjklpoiuytrewq
Reverse of the word is: qwertyuioplkjhgfdsazxcvbnmmnbvcxzasdfghjklpoiuytrewq
Method 1 says it is a palindrome
Method 2 says it is a palindrome

Enter a word: java
Reverse of the word is: avaj
Method 1 says it is not a palindrome
Method 2 says it is not a palindrome
*/