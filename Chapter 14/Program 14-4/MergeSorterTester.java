/*
Zach Panzarino and Jeremy Switlyk
4/8/16
Program 14.4 - merge sorts of strings
*/

import java.util.Arrays;
public class MergeSorterTester {
    public static void main(String[] args){
        String[] a = {"Hello", "I", "am", "i", "and", "you", "Are", "You"};
        System.out.println(Arrays.toString(a));
        MergeSorter sorter = new MergeSorter(a);
        sorter.sort();
        System.out.println(Arrays.toString(a));
    }
}

/* Program Output
[Hello, I, am, i, and, you, Are, You]
[Are, Hello, I, You, am, and, i, you]
*/