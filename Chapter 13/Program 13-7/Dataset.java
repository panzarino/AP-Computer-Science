/*
Zach Panzarino and Jeremy Switlyk
3/11/16
Program 13.7 - calculating array sums
*/

public class Dataset {
    private int[] data;
    public Dataset(int[] input){
        data = input;
    }
    public int getSum(){
        if (data.length == 1)
            return data[0];
        int first = data[0];
        int[] rest = new int[data.length-1];
        for (int x=1; x<data.length; x++){
            rest[x-1] = data[x];
        }
        Dataset next = new Dataset(rest);
        return first + next.getSum();
    }
}