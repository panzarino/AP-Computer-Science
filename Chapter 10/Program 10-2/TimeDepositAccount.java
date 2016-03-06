/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.2 - creating a savings account
*/

public class TimeDepositAccount extends SavingsAccount {
    private double months, penalty;
    private int count;
    public TimeDepositAccount(double i, double m, double p){
        super(i);
        months = m;
        penalty = p;
        count = 0;
    }
    public String withdraw(double amount){
        double fee = 0;
        if (count<months)
            fee = penalty;
        return super.withdraw(amount+fee);
    }
    public void addInterest(){
        super.addInterest();
        count++;
    }
}