/*
Zach Panzarino and Jeremy Switlyk
2/24/16
Lottery - A program that simulates the lottery
*/

public class Game {
    private Container container;
    private Picker picker;
    private int num;
    public Game(int chosen, int total){
        container = new Container(total);
        picker = new Picker(container);
        num = chosen;
    }
    public void pickBalls(){
        for (int x=1; x<=num; x++){
            picker.chooseBall();
        }
    }
    public String toString(){
        return picker.toString();
    }
}