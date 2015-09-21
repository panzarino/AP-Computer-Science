/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.8 - generates lucky lottery numbers
 */

import java.util.Random;
public class LotteryPrinter {
	public static void main(String[] args){
		Random r = new Random();
		System.out.println("Play this combination - it'll make you rich! "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1));
		System.out.print("Expected range: 1-49");
	}
}

/* Program Output
Play this combination - it'll make you rich! 29 26 36 42 19 24
Expected range: 1-49

Play this combination - it'll make you rich! 3 33 19 35 44 46
Expected range: 1-49

Play this combination - it'll make you rich! 3 31 23 16 3 2
Expected range: 1-49

Play this combination - it'll make you rich! 5 21 15 18 27 49
Expected range: 1-49
*/