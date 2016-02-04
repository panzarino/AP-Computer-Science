/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.1 - working with data sets
 */

public class DataSet{
    private double sum;
    private Measurable maximum;
    private int count;
    public void add(Measurable x){
        sum = sum + x.getMeasure();
        if (count == 0 || maximum.getMeasure() < x.getMeasure())
            maximum = x;
        count++;    
    }
    public Measurable getMaximum(){
        return maximum;
    }
    public double getAverage(){
        return sum/count;
    }
}