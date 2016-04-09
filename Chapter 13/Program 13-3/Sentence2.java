/*
Zach Panzarino and Jeremy Switlyk
3/11/16
Program 13.3 - reversing a sentence
*/

public class Sentence2 {
    private String sentence;
    public Sentence2(String s){
        sentence = s;
    }
    public void reverse(){
        String output = "";
        for (int x=sentence.length()-1; x>=0; x--){
            output += sentence.charAt(x);
        }
        sentence = output;
    }
    public String getText(){
        return sentence;
    }
}