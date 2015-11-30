/*
 * Zach Panzarino
 * 11/12/15
 * Program 5.15 - extra credit - tests methods of the line class
 */

public class LineTester {
	public static void main(String[] args){
		Line line1 = new Line(10);
		Line line2 = new Line(0);
		System.out.println("These lines intersect: "+line1.intersects(line2));
		System.out.println("These lines are parallel: "+line1.isParallel(line2));
		System.out.println("These lines are the same: "+line1.equals(line2));
		System.out.println("Expected: false, true, false");
		System.out.println();
		Line line3 = new Line(10, 8);
		Line line4 = new Line(0, 8, 10);
		System.out.println("These lines intersect: "+line3.intersects(line4));
		System.out.println("These lines are parallel: "+line3.isParallel(line4));
		System.out.println("These lines are the same: "+line3.equals(line4));
		System.out.println("Expected: false, false, true");
		System.out.println();
		Line line5 = new Line(10, 5, 100, 20);
		Line line6 = new Line(10, 10, 2);
		System.out.println("These lines intersect: "+line5.intersects(line6));
		System.out.println("These lines are parallel: "+line5.isParallel(line6));
		System.out.println("These lines are the same: "+line5.equals(line6));
		System.out.println("Expected: true, false, false");
	}
}

/* Program Output
These lines intersect: false
These lines are parallel: true
These lines are the same: false
Expected: false, true, false

These lines intersect: false
These lines are parallel: false
These lines are the same: true
Expected: false, false, true

These lines intersect: true
These lines are parallel: false
These lines are the same: false
Expected: true, false, false
*/