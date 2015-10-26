/*
 * Zach Panzarino
 * 10/16/15
 * Program 4.3 - ice cream cone stats
 */

public class IceCreamCone {
	private double height;
	private double radius;
	public IceCreamCone(double h, double r){
		height = h;
		radius = r;
	}
	public double getSurfaceArea(){
		return Math.PI*radius*Math.sqrt(Math.pow(radius,  2)+Math.pow(height, 2));
	}
	public double getVolume(){
		return Math.PI*Math.pow(radius, 2)*(height/3);
	}
}
