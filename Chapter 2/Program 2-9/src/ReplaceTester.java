/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.9 - Encodes a string by replacing characters
 */

public class ReplaceTester {
	public static void main(String[] args){
		String m = "Mississippi";
		System.out.println(m);
		m = m.replace('i', '!').replace('s', '$');
		System.out.println(m);
		System.out.print("Expected Output: M!$$!$$!pp!");
	}
}

/* Program Output
Mississippi
M!$$!$$!pp!
Expected Output: M!$$!$$!pp!
*/