/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.3 - tests the ice cream class
 */

import java.util.Scanner;
public class IceCreamConeTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the height of the cone: ");
		double height = scan.nextDouble();
		System.out.print("Enter the radius of the cone: ");
		double radius = scan.nextDouble();
		IceCreamCone cone = new IceCreamCone(height, radius);
		System.out.println("Surface area of the cone: "+cone.getSurfaceArea());
		System.out.println("Volume of the cone: "+cone.getVolume());
		System.out.println("Expected surface area of the cone: 1404.96");
		System.out.println("Expected volume of the cone: 4188.79");
	}
}

/* Program Output
Enter the height of the cone: 10
Enter the radius of the cone: 20
Surface area of the cone: 1404.9629462081452
Volume of the cone: 4188.790204786391
Expected surface area of the cone: 1404.96
Expected volume of the cone: 4188.79
*/