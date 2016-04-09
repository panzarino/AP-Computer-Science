/*
Zach Panzarino and Jeremy Switlyk
3/9/16
Program 13.1 - reversing a sentence
*/

import java.util.Scanner;
public class SentenceTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        Sentence greeting = new Sentence(sentence);
        System.out.println("Original Sentence: " + greeting.getText());
        greeting.reverse();
        System.out.println("Reversed: " + greeting.getText());
        System.out.println("Expected test output: ?uoy era woH - erehT iH");
    }
}

/* Program Output
Enter a sentence: Hi There - How are you?
Original Sentence: Hi There - How are you?
Reversed: ?uoy era woH - erehT iH
Expected test output: ?uoy era woH - erehT iH
*/