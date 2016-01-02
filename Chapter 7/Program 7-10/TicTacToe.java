/*
Zach Panzarino and Jeremy Switlyk
12/11/15
Program 7.10 - text-based game of tic tac toe
*/

public class TicTacToe{
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    public TicTacToe(){
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }
    public void set(int i, int j, String player){
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }
    public String toString(){
        String r = "";
        for (int i = 0; i < ROWS; i++){
            r = r + "|";
            for (int j = 0; j < COLUMNS; j++)
                r = r + board[i][j];
            r = r + "|\n";    
        }
        return r;
    }
    public String getWinner(){
        for (int x=0; x<ROWS; x++){
            if ((board[x][0].equals(board[x][1]) && board[x][0].equals(board[x][2])) && !board[x][0].equals(" "))
                return board[x][0];
        }
        for (int y=0; y<COLUMNS; y++){
            if ((board[0][y].equals(board[1][y]) && board[0][y].equals(board[2][y])) && !board[0][y].equals(" "))
                return board[0][y];
        }
        if ((board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) && !board[0][0].equals(" "))
            return board[0][0];
        if ((board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) && !board[0][2].equals(" "))
            return board[0][2];
        return " ";
    }
}
