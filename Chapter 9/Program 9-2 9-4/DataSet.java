/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.2 and 9.4 - working with data sets
 */

public class DataSet{
    private double sum;
    private Measurable maximum;
    private Measurable minimum;
    private int count;
    public void add(Measurable x){
        sum += x.getMeasure();
        if (count == 0 || (maximum.getMeasure() < x.getMeasure()))
            maximum = x;
        if (count == 0 || (minimum.getMeasure() > x.getMeasure()))
            minimum = x;
        count++;
    }
    public Measurable getMaximum(){
        return maximum;
    }
    public Measurable getMinimum(){
        return minimum;
    }
    public double getAverage(){
        return sum/count;
    }
}