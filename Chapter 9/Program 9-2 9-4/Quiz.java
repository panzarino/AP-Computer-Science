/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.2 and 9.4 - working with data sets
 */
 
public class Quiz implements Measurable {
    private double num;
    private String letter;
    public Quiz(double gnum, String let){
        num = gnum;
        letter = let;
    }
    public double getNumber(){
        return num;
    }
    public String getLetter(){
        return letter;
    }
    public double getMeasure(){
        return this.getNumber();
    }
    public String toString(){
        return num+" "+letter;
    }
}