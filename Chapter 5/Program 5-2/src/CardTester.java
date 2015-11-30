/*
 * Zach Panzarino
 * 11/9/15
 * Program 5.2 - tests the card class
 */

import java.util.Scanner;
public class CardTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the card notation (number/face)(suit): ");
		String cardfmt = scan.next();
		Card card = new Card(cardfmt);
		System.out.println("Description: "+card.getDescription());
		System.out.println("Test 1 expected output: Unknown");
		System.out.println("Test 2 expected output: 2 of Hearts");
		System.out.println("Test 3 expected output: 10 of Diamonds");
		System.out.println("Test 4 expected output: Ace of Spades");
		System.out.println("Test 5 expected output: King of Clubs");
		System.out.println("Test 6 expected output: Unknown");
	}
}

/* Program Output
Enter the card notation (number/face)(suit): 5F
Description: Unknown
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown

Enter the card notation (number/face)(suit): 2H
Description: 2 of Hearts
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown

Enter the card notation (number/face)(suit): 10D
Description: 10 of Diamonds
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown

Enter the card notation (number/face)(suit): AS
Description: Ace of Spades
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown

Enter the card notation (number/face)(suit): KC
Description: King of Clubs
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown

Enter the card notation (number/face)(suit): 12C
Description: Unknown
Test 1 expected output: Unknown
Test 2 expected output: 2 of Hearts
Test 3 expected output: 10 of Diamonds
Test 4 expected output: Ace of Spades
Test 5 expected output: King of Clubs
Test 6 expected output: Unknown
*/