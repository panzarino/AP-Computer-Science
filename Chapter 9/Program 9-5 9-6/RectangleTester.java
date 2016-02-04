/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.5 9.6 - working with data sets
 */

import java.awt.Rectangle;
public class RectangleTester {
    public static void main(String[] args){
        RectangleMeasurer meas = new RectangleMeasurer();
        DataSet set = new DataSet(meas);
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(10, 20, 30, 40);
        Rectangle rect3 = new Rectangle(20, 30, 5, 15);
        set.add(rect1);
        set.add(rect2);
        set.add(rect3);
        Rectangle max = (Rectangle) set.getMaximum();
        Rectangle min = (Rectangle) set.getMinimum();
        System.out.println("Rectangle 1: "+rect1);
        System.out.println("Rectangle 2: "+rect2);
        System.out.println("Rectangle 3: "+rect3);
        System.out.println("Average Perimeter: "+set.getAverage());
        System.out.println("Largest Perimeter: "+max.getHeight()+" x "+max.getWidth());
        System.out.println("Smallest Perimeter: "+min.getHeight()+" x "+min.getWidth());
    }
}

/* Program Output
Rectangle 1: java.awt.Rectangle[x=5,y=10,width=20,height=30]
Rectangle 2: java.awt.Rectangle[x=10,y=20,width=30,height=40]
Rectangle 3: java.awt.Rectangle[x=20,y=30,width=5,height=15]
Average Perimeter: 93.33333333333333
Largest Perimeter: 40.0 x 30.0
Smallest Perimeter: 15.0 x 5.0
*/