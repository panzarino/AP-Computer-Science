/*
 * Zach Panzarino and Jeremy Switlyk
 * 1/22/15
 * Program 9.5 9.6 - working with data sets
 */

public class DataSet {
    private double sum;
    private Object maximum;
    private Object minimum;
    private int count;
    private Measurer measurer;
    public DataSet(Measurer aMeasurer){
        sum = 0;
        count = 0;
        maximum = null;
        measurer = aMeasurer;
    }
    public void add(Object x){
        sum = sum + measurer.measure(x);
        if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
            maximum = x;
        if (count == 0 || measurer.measure(minimum) > measurer.measure(x))
            minimum = x;
        count++;    
    }
    public double getAverage(){
        if (count == 0)
            return 0;
        else return sum / count;    
    }
    public Object getMaximum(){
        return maximum;
    }
    public Object getMinimum(){
        return minimum;
    }
}