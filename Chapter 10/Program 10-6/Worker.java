/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.6 - creating workers
*/

public abstract class Worker {
    private String name;
    private double rate;
    public Worker(String n, double r){
        name = n;
        rate = r;
    }
    public String getName(){
        return name;
    }
    public double getRate(){
        return rate;
    }
    public abstract double computePay(int hours);
}