/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.2 - selection sort in increasing order of coins
*/

public class Coin {
    private double value;
    private String name;
    public Coin(double aValue, String aName){ 
        value = aValue; 
        name = aName;
    }
    public double getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Coin[value=" + value + ",name=" + name + "]";
    }
}