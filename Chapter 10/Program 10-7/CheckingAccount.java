/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.7 - extra credit - advanced bank accounts
*/

public class CheckingAccount extends BankAccount {
    private int count;
    private static final int FREE = 3;
    private static final double FEE = 2.0;
    public CheckingAccount(double bal){
        super(bal);
        count = 0;
    }
    public String deposit(double amount){
        count++;
        super.deposit(amount);
        return "";
    }
    public String withdraw(double amount){
        count++;
        super.withdraw(amount);
        return "";
    }
    public void deductFees(){
        if (count > FREE){
            double fees = FEE * (count - FREE);
            super.withdraw(fees);
        }
        count = 0;
    }
    public void endOfMonth(){
        deductFees();
    }
}