/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.2 - creating a savings account
*/

public class TimeDepositTester {
    public static void main(String[] args){
        TimeDepositAccount bank = new TimeDepositAccount(5, 3, 20);
        bank.deposit(1000);
        bank.deposit(1300);
        System.out.println("Balance after 1st period: "+bank.getBalance());
        System.out.println("Interest during 1st period: "+bank.getInterest()*bank.getMinimum()/100);
        bank.addInterest();
        System.out.println("Balance after 1st period interest applied: "+bank.getBalance());
        bank.deposit(1000);
        bank.withdraw(100);
        System.out.println("Balance after 2nd period: "+bank.getBalance());
        System.out.println("Interest during 2nd period: "+bank.getInterest()*bank.getMinimum()/100);
        bank.addInterest();
        System.out.println("Balance after 2nd period interest applied: "+bank.getBalance());
        bank.deposit(1000);
        bank.deposit(1300);
        System.out.println("Balance after 3rd period: "+bank.getBalance());
        System.out.println("Interest during 3rd period: "+bank.getInterest()*bank.getMinimum()/100);
        bank.addInterest();
        System.out.println("Balance after 3rd period interest applied: "+bank.getBalance());
    }
}

/* Program Output
Balance after 1st period: 2300.0
Interest during 1st period: 50.0
Balance after 1st period interest applied: 2350.0
Balance after 2nd period: 3230.0
Interest during 2nd period: 117.5
Balance after 2nd period interest applied: 3347.5
Balance after 3rd period: 5647.5
Interest during 3rd period: 167.375
Balance after 3rd period interest applied: 5814.875
*/