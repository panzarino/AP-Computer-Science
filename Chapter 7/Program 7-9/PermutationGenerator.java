/*
Zach Panzarino and Jeremy Switlyk
12/11/15
Program 7.9 - generating random permutations
*/

import java.util.Random;
import java.util.ArrayList;
public class PermutationGenerator{
    private ArrayList<Integer> nums;
    public PermutationGenerator(){
        nums = new ArrayList<Integer>();
        for (int x=1; x<=10; x++)
            nums.add(x);
    }
    public int[] nextPermutation(){
        ArrayList<Integer> copy = new ArrayList<Integer>(nums);
        int[] output = new int[10];
        Random rand = new Random();
        int count = 0;
        while (copy.size()>0){
            int index = rand.nextInt(copy.size());
            output[count++]=copy.get(index);
            copy.remove(index);
        }
        return output;
    }
}