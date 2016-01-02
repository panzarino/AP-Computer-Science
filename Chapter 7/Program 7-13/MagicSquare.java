/*
Zach Panzarino and Jeremy Switlyk
12/11/15
Program 7.13 - makes a magic square
*/

public class MagicSquare{
    private int[][] square;
    public MagicSquare(int n){
        square = new int[n][n];
        int half=n/2;
        int col=half;
        int row=n-1;
        for (int x=1; x<=n*n; x++){
            if (col>n-1){
                col=0;
            }
            if (row>n-1){
                row=0;
            }
            if (square[row][col]==0){
                square[row++][col++]=x;
            }
            else if(square[row][col]!=0){
                if (row==0 && col==0){
                    row=n;
                    col=n;
                }
                row--;
                square[--row][--col]=x;
                row++;
                col++;
            }
        }
    }
    public String toString(){
        String output = "";
        for (int[] row: square){
            for (int num: row){
                if (num<10)
                    output+=num+"   ";
                else if (num<100)
                    output+=num+"  ";
                else
                    output+=num+" ";
            }
            output+="\n";
        }
        return output;
    }
}