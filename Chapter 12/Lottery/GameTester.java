/*
Zach Panzarino and Jeremy Switlyk
2/24/16
Lottery - A program that simulates the lottery
*/

public class GameTester {
    public static void main(String[] args){
        Game game = new Game(6, 49);
        System.out.println(game);
        System.out.println("Picking Balls");
        game.pickBalls();
        System.out.println(game);
    }
}

/* Program Output
Chosen Balls: [ ]
Balls in Container: [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 ]
Picking Balls
Chosen Balls: [ 2, 15, 31, 4, 24, 38 ]
Balls in Container: [ 1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 ]
*/