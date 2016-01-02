/*
Zach Panzarino and Jeremy Switlyk
12/17/15
Fun Number 2 - more advanced fun numbers
*/

import java.util.ArrayList;
import java.util.Collections;
public class FunNumber2{
    private ArrayList<Integer> nums;
    public FunNumber2(){
        nums = new ArrayList<Integer>();
    }
    public void addData(int x){
        nums.add(x);
    }
    public int getNum(){
        return nums.size();
    }
    public int getMax(){
        int max = nums.get(0);
        for (int x: nums){
            max = Math.max(max, x);
        }
        return max;
    }
    public int getMin(){
        int min = nums.get(0);
        for (int x: nums){
            min = Math.min(min, x);
        }
        return min;
    }
    public String getMode(){
        int mode = 0, count = 0, dubs = 0;
        for (int x: nums){
            int c = 0;
            for (int y:nums){
                if (x==y)
                    c++;
            }
            if (c>count){
                count = c;
                mode = x;
            }
        }
        if (count==1){
            return "None";
        }
        return ""+mode;
    }
    public double getMedian(){
        ArrayList<Integer> copy = new ArrayList<Integer>(nums);
        int len = nums.size();
        int half = len/2;
        Collections.sort(copy);
        if (len%2==0){
            return (copy.get(half)+copy.get(half-1))/2.0;
        }
        else{
            return copy.get(half);
        }
    }
    public double getMean(){
        double total = 0;
        for (int x: nums){
            total+=x;
        }
        return total/nums.size();
    }
}