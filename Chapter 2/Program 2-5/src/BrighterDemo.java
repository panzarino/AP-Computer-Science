/*
 * Zach Panzarino
 * 9/17/15
 * Program 2.5 - brightens a color
 */

import java.awt.Color;
public class BrighterDemo {
	public static void main(String[] args){
		Color color = new Color(50,100,150);
		Color result = color.brighter();
		System.out.print(result);
	}
}

/* Program Output
java.awt.Color[r=71,g=142,b=214]
*/