/*
Zach Panzarino and Jeremy Switlyk
12/9/15
Programs 7.2 through 7.6 - testing the purse class
*/

import java.util.Scanner;
public class PurseTester{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Purse purse = new Purse();
        String coin;
        System.out.println("Purse 1 values: ");
        do {
            System.out.print("Enter a coin name for the first purse (\"done\" to stop entering values): ");
            coin = in.next();
            if (!coin.equalsIgnoreCase("done") && (coin.equalsIgnoreCase("quarter") || coin.equalsIgnoreCase("dime") || coin.equalsIgnoreCase("nickel") || coin.equalsIgnoreCase("penny")))
                purse.addCoin(coin.toLowerCase());
        } while (!coin.equalsIgnoreCase("done"));
        Purse purse2 = new Purse();
        System.out.println("Purse 2 values: ");
        do {
            System.out.print("Enter a coin name for the second purse (\"done\" to stop entering values): ");
            coin = in.next();
            if (!coin.equalsIgnoreCase("done") && (coin.equalsIgnoreCase("quarter") || coin.equalsIgnoreCase("dime") || coin.equalsIgnoreCase("nickel") || coin.equalsIgnoreCase("penny")))
                purse2.addCoin(coin);
        } while (!coin.equalsIgnoreCase("done"));
        System.out.println("Purse 1 Contents: " + purse.toString());
        System.out.println("Purse 2 Contents: " + purse2.toString());
        System.out.println("The purses are the same: " + purse.sameContents(purse2));
        System.out.println("The purses have the same contents: " + purse.sameCoins(purse2));
        purse.reverse();
        System.out.println("Purse 1 Reversed: " + purse.toString());
        purse2.reverse();
        System.out.println("Purse 2 Reversed: " + purse2.toString());
        purse.transfer(purse2);
        System.out.println("Purse 1 Contents after transfer from purse 2 to purse 1: " + purse.toString());
        System.out.println("Purse 2 Contents after transfer from purse 2 to purse 1: " + purse2.toString());
    }
}

/*
Purse 1 values: 
Enter a coin name for the first purse ("done" to stop entering values): quarter
Enter a coin name for the first purse ("done" to stop entering values): nickel
Enter a coin name for the first purse ("done" to stop entering values): dime
Enter a coin name for the first purse ("done" to stop entering values): penny
Enter a coin name for the first purse ("done" to stop entering values): done
Purse 2 values: 
Enter a coin name for the second purse ("done" to stop entering values): nickel
Enter a coin name for the second purse ("done" to stop entering values): dime
Enter a coin name for the second purse ("done" to stop entering values): penny
Enter a coin name for the second purse ("done" to stop entering values): quarter
Enter a coin name for the second purse ("done" to stop entering values): done
Purse 1 Contents: Purse[quarter, nickel, dime, penny] 
Purse 2 Contents: Purse[nickel, dime, penny, quarter] 
The purses are the same: false
The purses have the same contents: true
Purse 1 Reversed: Purse[penny, dime, nickel, quarter] 
Purse 2 Reversed: Purse[quarter, penny, dime, nickel] 
Purse 1 Contents after transfer from purse 2 to purse 1: Purse[penny, dime, nickel, quarter, quarter, penny, dime, nickel] 
Purse 2 Contents after transfer from purse 2 to purse 1: Purse[]
*/