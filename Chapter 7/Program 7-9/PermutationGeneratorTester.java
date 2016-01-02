/*
Zach Panzarino and Jeremy Switlyk
12/11/15
Program 7.9 - PermutationGenerator tester class
*/

import java.util.Scanner;
public class PermutationGeneratorTester{
    public static void main(String[] args){
        PermutationGenerator gen = new PermutationGenerator();
        System.out.println("Here are five random sequences of the numbers 1-10:\n");
        for (int x=1; x<=5; x++){
            for (int y: gen.nextPermutation()){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
/* Program Output
Here are five random sequences of the numbers 1-10:

9 6 2 8 4 3 10 1 7 5 
5 9 8 10 3 7 2 6 1 4 
10 7 9 1 6 8 4 5 3 2 
2 9 3 6 4 10 1 8 7 5 
3 10 6 9 8 7 4 5 2 1 

Here are five random sequences of the numbers 1-10:

8 10 7 6 4 9 2 5 1 3 
5 10 7 1 4 6 8 2 9 3 
6 8 4 9 1 3 5 10 2 7 
9 5 8 2 3 6 4 7 1 10 
4 2 5 6 10 7 8 3 1 9 
*/