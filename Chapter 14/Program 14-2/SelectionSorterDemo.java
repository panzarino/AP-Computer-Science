/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.2 - selection sort in increasing order of coins
*/

import java.util.Arrays;
public class SelectionSorterDemo {
    public static void main(String[] args){
        Coin[] a = {new Coin(0.05, "Nickel"), new Coin(0.1, "Dime"), new Coin(0.25, "Quarter"), new Coin(0.01, "Penny"), new Coin(0.5, "Half-Dollar")};
        System.out.println(Arrays.toString(a));
        SelectionSorter sorter = new SelectionSorter(a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
    }
}

/* Program Output
[Coin[value=0.05,name=Nickel], Coin[value=0.1,name=Dime], Coin[value=0.25,name=Quarter], Coin[value=0.01,name=Penny], Coin[value=0.5,name=Half-Dollar]]
[Coin[value=0.01,name=Penny], Coin[value=0.05,name=Nickel], Coin[value=0.1,name=Dime], Coin[value=0.25,name=Quarter], Coin[value=0.5,name=Half-Dollar]]
*/