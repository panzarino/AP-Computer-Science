/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.1 - working with data sets
 */

import java.util.Random;
public class Die implements Measurable{
    private int sides;
    private Random generator;
    private int value;
    public Die(int s){
        sides = s;
        generator = new Random();
    }
    public int cast(){
        value =  generator.nextInt(sides) + 1;
        return value;
    }
    public double getMeasure(){
        return value;
    }
}