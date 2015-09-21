/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.10 - switches letters in the hello world statement
 */

public class HollePrinter {
	public static void main(String[] args){
		String str = "Hello, World!";
		System.out.println(str);
		System.out.println(str.replace('e', 'p').replace('o', 'e').replace('p','o'));
		System.out.print("Expected String: Holle, Werld");
	}
}

/* Program Output
Hello, World!
Holle, Werld!
Expected String: Holle, Werld
*/