/*
Zach Panzarino and Jeremy Switlyk
12/9/15
Programs 7.2 through 7.6 - making a purse class
*/

import java.util.ArrayList;
import java.util.Arrays;
public class Purse{
    private ArrayList<String> coins;
    public Purse(){
        coins = new ArrayList<String>();
    }
    public void addCoin(String coinName){
        // Program 7.2
        coins.add(coinName);
    }
    public String toString(){
        // Program 7.2
        String output = "Purse[";
        for (String x: coins){
            output += x + ", ";
        }
        if (!output.equals("Purse["))
            output += "\b\b";
        output += "]";
        return output;
    }
    public void reverse(){
        // Program 7.3
        ArrayList<String> copy = new ArrayList<String>(coins);
        coins.clear();
        for (int x=copy.size()-1; x>=0; x--){
            coins.add(copy.get(x));
        }
    }
    public void transfer(Purse other){
        // Program 7.4
        while (other.coins.size() > 0){
            coins.add(other.coins.get(0));
            other.coins.remove(0);
        }
    }
    public boolean sameContents(Purse other){
        // Program 7.5
        return coins.equals(other.coins) ? true: false;
    }
    private int[] coinCount(){
        // Program 7.6
        int[] output = new int[4];
        for (String coin: coins){
            switch (coin){
                case "quarter":
                    output[0]+=1;
                    break;
                case "dime":
                    output[1]+=1;
                    break;
                case "nickel":
                    output[2]+=1;
                    break;
                case "penny":
                    output[3]+=1;
                    break;
            }
        }
        return output;
    }
    public boolean sameCoins(Purse other){
        // Program 7.6
        return Arrays.equals(this.coinCount(), other.coinCount()) ? true: false;
    }
}