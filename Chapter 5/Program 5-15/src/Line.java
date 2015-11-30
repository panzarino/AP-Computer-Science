/*
 * Zach Panzarino
 * 11/12/15
 * Program 5.15 - extra credit - calculates statistics for a line
 */

public class Line {
	private double slope, yint;
	private final double EPSILON = Math.pow(10, -14);
	public Line(double x, double y, double m){
		slope = m;
		yint = y - m*x;
	}
	public Line(double x1, double y1, double x2, double y2){
		slope = (y2-y1)/(x2-x1);
		yint = y1 - slope*x1;
	}
	public Line(double m, double b){
		slope = m;
		yint = b;
	}
	public Line(double x){
		slope = 0;
		yint = x;
	}
	public boolean intersects(Line other){
		if (Math.abs(this.slope-other.slope)<EPSILON)
			return false;
		else
			return true;
	}
	public boolean equals(Line other){
		if (Math.abs(this.slope-other.slope)<EPSILON && Math.abs(this.yint-other.yint)<EPSILON)
			return true;
		else
			return false;
	}
	public boolean isParallel(Line other){
		if (Math.abs(this.slope-other.slope)<EPSILON && !this.equals(other))
			return true;
		else
			return false;
	}
}
