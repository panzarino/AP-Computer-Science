/*
 * Zach Panzarino
 * 9/15/15
 * Program 2.2 - computes and prints perimeter of rectangle object
 */

import java.awt.Rectangle;
public class PerimeterTester {
	public static void main(String[] args){
		Rectangle rect = new Rectangle(0,0,20,30);
		System.out.println("Perimeter of rectangle is "+((rect.getWidth()*2)+(rect.getHeight()*2)));
		System.out.print("Expected perimeter is 100.0");
	}
}

/* Program Output
Perimeter of rectangle is 100.0
Expected perimeter is 100.0
*/