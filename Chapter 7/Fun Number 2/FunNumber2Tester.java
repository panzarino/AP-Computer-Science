/*
Zach Panzarino and Jeremy Switlyk
12/17/15
Fun Number 2 - tests more advanced fun numbers
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class FunNumber2Tester{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in1 = new Scanner(new File("FunNum1.txt"));
        Scanner in2 = new Scanner(new File("FunNum2.txt"));
        Scanner in3 = new Scanner(new File("FunNum3.txt"));
        FunNumber2 array1 = new FunNumber2();
        while (in1.hasNext()){
            array1.addData(in1.nextInt());
        }
        FunNumber2 array2 = new FunNumber2();
        while (in2.hasNext()){
            array2.addData(in2.nextInt());
        }
        FunNumber2 array3 = new FunNumber2();
        while (in3.hasNext()){
            array3.addData(in3.nextInt());
        }
        System.out.println("File Name\tNumber of Elements\tMin Value\tMax Value\tMean\t\t\tMedian\tMode");
        System.out.println("\"FunNum1\"\t" + array1.getNum() + "\t\t\t" + array1.getMin()
            + "\t\t" + array1.getMax() + "\t\t" + array1.getMean() + "\t"
            + array1.getMedian() + "\t" + array1.getMode());
        System.out.println("\"FunNum2\"\t" + array2.getNum() + "\t\t\t" + array2.getMin()
            + "\t\t" + array2.getMax() + "\t\t" + array2.getMean() + "\t"
            + array2.getMedian() + "\t" + array2.getMode());
        System.out.println("\"FunNum3\"\t" + array3.getNum() + "\t\t\t" + array3.getMin()
            + "\t\t" + array3.getMax() + "\t\t" + array3.getMean() + "\t"
            + array3.getMedian() + "\t" +array3.getMode());
        in1.close();
        in2.close();
        in3.close();
    }
}

/* 
File Name       Number of Elements      Min Value       Max Value       Mean                    Median  Mode
"FunNum1"       108                     -980            554             30.87037037037037       17.0    4
"FunNum2"       111                     -980            10              -50.57657657657658      -22.0   -4
"FunNum3"       108                     1               3000            366.4166666666667       228.0   None
*/