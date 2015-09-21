/*
 * Zach Panzarino
 * 9/15/15
 * Program 2.3 - constructs and translates a rectangle to make a large rectangle made up of 4 smaller rectangles
 */

import java.awt.Rectangle;
public class FourRectanglePrinter {
	public static void main(String[] args){
		Rectangle box = new Rectangle(0,0,10,10);
		System.out.println(box);
		box.translate(10,0);
		System.out.println(box);
		box.translate(0,10);
		System.out.println(box);
		box.translate(-10,0);
		System.out.print(box);
	}
}

/* Program Output
java.awt.Rectangle[x=0,y=0,width=10,height=10]
java.awt.Rectangle[x=10,y=0,width=10,height=10]
java.awt.Rectangle[x=10,y=10,width=10,height=10]
java.awt.Rectangle[x=0,y=10,width=10,height=10]
*/