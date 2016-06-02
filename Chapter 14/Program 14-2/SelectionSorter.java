/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.2 - selection sort in increasing order of coins
*/

public class SelectionSorter {
    private Coin[] a;
    public SelectionSorter(Coin[] array){
        a = array;
    }
    public void sort(){
        for (int i=0; i<a.length-1; i++){
            int max = maximumPosition(i);
            swap(max, i);
        }
    }
    private int maximumPosition(int from){
        int max = from;
        for (int i=from+1; i<a.length; i++)
            if (a[i].getValue() < a[max].getValue())
                max = i;
        return max;
    }
    private void swap(int i, int j){
        Coin temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}