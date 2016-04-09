/*
Zach Panzarino and Jeremy Switlyk
3/9/16
Program 13.1 - reversing a sentence
*/

public class Sentence {
    private String sentence;
    public Sentence(String string){
        sentence = string;
    }
    public void reverse(){
        if (sentence.length() <= 0)
            return;
        String first = sentence.substring(0, 1);
        String rest = sentence.substring(1);
        Sentence next = new Sentence(rest);
        next.reverse();
        sentence = next.getText() + first;
    }
    public String getText(){
        return sentence;    
    }
}