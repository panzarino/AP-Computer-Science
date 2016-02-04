/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.5 9.6 - working with data sets
 */

import java.awt.Rectangle;
public class RectangleMeasurer implements Measurer {
    public double measure(Object anObject){
        Rectangle rect = (Rectangle) anObject;
        return 2*rect.getWidth() + 2*rect.getHeight();
    }
}