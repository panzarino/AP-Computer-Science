/*
Zach Panzarino and Jeremy Switlyk
2/24/16
Lottery - A program that simulates the lottery
*/

import java.util.ArrayList;
public class Container {
    private ArrayList<Ball> balls;
    public Container(int num){
        balls = new ArrayList<Ball>();
        for (int x=1; x<=num; x++){
            balls.add(new Ball(x));
        }
    }
    public int getNumberOfBalls(){
        return balls.size();
    }
    public Ball getBall(int index){
        return balls.get(index);
    }
    public void removeBall(int index){
        balls.remove(index);
    }
    public String toString(){
        String output = "Balls in Container: [ ";
        for (Ball x: balls){
            output+=x.getNumber()+", ";
        }
        if (balls.size()>0){
            output+="\b\b ]";
        }
        else {
            output = "Balls in Container: [ ]";
        }
        return output;
    }
}