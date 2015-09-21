/*
 * Zach Panzarino
 * 9/15/15
 * Program 2.1 - constructs rectangle object and prints area
 */

import java.awt.Rectangle;
public class AreaTester {
	public static void main(String[] args){
		Rectangle rect = new Rectangle(0,0,20,30);
		System.out.println("The area of the rectangle is "+(rect.getWidth()*rect.getHeight()));
		System.out.print("The expected area is 600.0");
	}
}

/* Program Output
The area of the rectangle is 600.0
The expected area is 600.0
*/