/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.6 - creating workers
*/

public class HourlyWorker extends Worker {
    public HourlyWorker(String name, double rate){
        super(name, rate);
    }
    public double computePay(int hours){
        int overtime = 0;
        if (hours>40){
            overtime = hours-40;
            hours = 40;
        }
        return getRate()*hours+getRate()*overtime*1.5;
    }
}