/*
Zach Panzarino and Jeremy Switlyk
2/24/16
Lottery - A program that simulates the lottery
*/

import java.util.ArrayList;
import java.util.Random;
public class Picker {
    Container container;
    ArrayList<Ball> chosen;
    public Picker(Container c){
        container = c;
        chosen = new ArrayList<Ball>();
    }
    public void chooseBall(){
        Random rand = new Random();
        int ball = rand.nextInt(container.getNumberOfBalls());
        chosen.add(container.getBall(ball));
        container.removeBall(ball);
    }
    public String toString(){
        String output = "Chosen Balls: [ ";
        for (Ball x: chosen){
            output+=x.getNumber()+", ";
        }
        if (chosen.size()>0){
            output+="\b\b ]\n";
        }
        else {
            output = "Chosen Balls: [ ]\n";
        }
        output+=container.toString();
        return output;
    }
}