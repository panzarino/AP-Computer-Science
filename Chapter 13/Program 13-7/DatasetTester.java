/*
Zach Panzarino and Jeremy Switlyk
3/11/16
Program 13.7 - calculating array sums
*/

import java.util.Scanner;
import java.util.Random;
public class DatasetTester {
    public static void main(String[] args){
        int[] test = {1,2,3,4,5};
        Dataset set = new Dataset(test);
        System.out.println("The sum of 1, 2, 3, 4, and 5 is "+set.getSum());
        System.out.println("Expected: 15");
        System.out.print("How many numbers should be randomly generated? ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Random rand = new Random();
        int[] array = new int[size];
        System.out.println("Here are your generated numbers: ");
        for (int x=0; x<size; x++){
            int num = rand.nextInt(10);
            array[x] = num;
            System.out.print(num+", ");
        }
        System.out.println("\b\b ");
        Dataset dataset = new Dataset(array);
        System.out.println("The sum of those numbers is "+dataset.getSum());
    }
}

/* Program Output
The sum of 1, 2, 3, 4, and 5 is 15
Expected: 15
How many numbers should be randomly generated? 6
Here are your generated numbers: 
1, 2, 2, 7, 4, 4  
The sum of those numbers is 20

The sum of 1, 2, 3, 4, and 5 is 15
Expected: 15
How many numbers should be randomly generated? 20
Here are your generated numbers: 
1, 8, 3, 7, 0, 7, 2, 4, 0, 4, 4, 4, 5, 2, 6, 5, 0, 3, 3, 7  
The sum of those numbers is 75
*/