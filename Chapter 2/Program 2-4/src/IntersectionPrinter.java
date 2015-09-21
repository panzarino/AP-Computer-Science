/*
 * Zach Panzarino
 * 9/15/15
 * Program 2.4 - prints the intersection of two rectangles and 
 */

import java.awt.Rectangle;
public class IntersectionPrinter {
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(0,0,20,20);
		Rectangle r2 = new Rectangle(10,10,20,20);
		Rectangle r3 = r1.intersection(r2);
		System.out.println("First Intersection Rectangle: "+r3);
		
		//rectangles are not supposed to overlap
		Rectangle r4 = new Rectangle(0,0,5,5);
		Rectangle r5 = new Rectangle(10,10,20,20);
		Rectangle r6 = r4.intersection(r5);
		System.out.println("Second Intersection Rectangle: "+r6);
		//can tell it is empty because of the negative length and width
	}
}

/* Program Output
First Intersection Rectangle: java.awt.Rectangle[x=10,y=10,width=10,height=10]
Second Intersection Rectangle: java.awt.Rectangle[x=10,y=10,width=-5,height=-5]
*/