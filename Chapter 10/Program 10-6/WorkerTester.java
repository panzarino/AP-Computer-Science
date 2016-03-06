/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.6 - creating workers
*/

public class WorkerTester {
    public static void main(String[] args){
        HourlyWorker hour = new HourlyWorker("Norman Bates", 15.5);
        SalaryWorker sal = new SalaryWorker("Betty Davis", 39);
        System.out.println("Hourly Worker - "+hour.getName()+" paid at a rate of "+hour.getRate()+" earned an hourly-based wage of "+hour.computePay(30));
        System.out.println("Salary Worker - "+sal.getName()+" paid at a rate of "+sal.getRate()+" earned an hourly-based wage of "+sal.computePay(50));
    }
}

/* Program Output
Hourly Worker - Norman Bates paid at a rate of 15.5 earned an hourly-based wage of 465.0
Salary Worker - Betty Davis paid at a rate of 39.0 earned an hourly-based wage of 1560.0
*/