/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.1 - creating a savings account
*/

public class SavingsAccountTester {
    public static void main(String[] args){
        SavingsAccount bank = new SavingsAccount(5);
        bank.deposit(1000);
        bank.deposit(100);
        bank.withdraw(500);
        bank.deposit(1000);
        bank.deposit(1000);
        System.out.println("Balance after 1st period: "+bank.getBalance());
        System.out.println("Minimum balance during 1st period: "+bank.getMinimum());
        bank.addInterest();
        System.out.println("Balance after 1st period interest applied: "+bank.getBalance());
        bank.deposit(100);
        bank.deposit(100);
        bank.withdraw(50);
        System.out.println("Balance after 2nd period: "+bank.getBalance());
        System.out.println("Minimum balance during 2nd period: "+bank.getMinimum());
        bank.addInterest();
        System.out.println("Balance after 2nd period interest applied: "+bank.getBalance());
        bank.withdraw(700);
        bank.deposit(200);
        bank.withdraw(1000);
        System.out.println("Balance after 3rd period: "+bank.getBalance());
        System.out.println("Minimum balance during 3rd period: "+bank.getMinimum());
        bank.addInterest();
        System.out.println("Balance after 3rd period interest applied: "+bank.getBalance());
    }
}

/* Program Output
Balance after 1st period: 2600.0
Minimum balance during 1st period: 600.0
Balance after 1st period interest applied: 2630.0
Balance after 2nd period: 2780.0
Minimum balance during 2nd period: 2630.0
Balance after 2nd period interest applied: 2911.5
Balance after 3rd period: 1411.5
Minimum balance during 3rd period: 1411.5
Balance after 3rd period interest applied: 1482.075
*/