/*
Zach Panzarino and Jeremy Switlyk
2/10/16
Program 10.7 - extra credit - advanced bank accounts
*/

public class BankAccountTester {
    public static void test(BankAccount account){
        account.deposit(600);
        account.deposit(3000);
        account.withdraw(200);
        account.deposit(100);
        account.withdraw(400);
        account.endOfMonth();
        System.out.println(account.getClass() + " balance " + account.getBalance());
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(5);
        CheckingAccount checking = new CheckingAccount(0);
        test(savings);
        test(checking);
    }
}

/* Program Output
class SavingsAccount balance 3255.0
class CheckingAccount balance 3096.0
*/