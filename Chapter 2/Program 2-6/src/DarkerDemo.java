/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.6 - darkens a color
 */

import java.awt.Color;
public class DarkerDemo {
	public static void main(String[] args){
		System.out.println(Color.RED);
		System.out.println(Color.RED.darker());
		System.out.print(Color.RED.darker().darker());
	}
}

/* Program Output
java.awt.Color[r=255,g=0,b=0]
java.awt.Color[r=178,g=0,b=0]
java.awt.Color[r=124,g=0,b=0]
*/