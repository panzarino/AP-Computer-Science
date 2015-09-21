/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.7 - prints a random number between 1 and 6 (like a die)
 */

import java.util.Random;
public class DieSimulator {
	public static void main(String[] args){
		Random r = new Random();
		System.out.print("The number will be between 1 and 6. This is the number: "+(r.nextInt(6)+1));
	}
}

/* Program Output
The number will be between 1 and 6. This is the number: 3

The number will be between 1 and 6. This is the number: 4

The number will be between 1 and 6. This is the number: 6

The number will be between 1 and 6. This is the number: 1
*/