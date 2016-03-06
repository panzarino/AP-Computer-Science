/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.6 - creating workers
*/

public class SalaryWorker extends Worker {
    public SalaryWorker(String name, double rate){
        super(name, rate);
    }
    public double computePay(int hours){
        return getRate()*40;
    }
}