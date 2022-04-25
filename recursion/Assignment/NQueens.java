package Assignment;

import java.util.ArrayList;
import java.util.List;

public class NQueens
{


    // FIRST APPROACH

    // public List<List<String>> solveNQueens(int n) {
    //     List<List<String>> l = new ArrayList<>();

    //     char [][]b = new char[n][n];

    //     for(int i = 0; i<b.length; i++)
    //     {
    //         for(int j = 0; j<b[i].length; j++)
    //         {
    //             b[i][j] = '.';
    //         }
    //     }

    //     solve(l,b,0);

    //     return l;
    // } 

    // private void solve(List<List<String>> l, char[][] b, int col) {
        
    //     if(col == b.length)
    //     {
    //         List<String> str = new ArrayList<>();

    //         for(int ind = 0; ind<b.length; ind++)
    //         {
    //             String s = new String(b[ind]);
    //             str.add(s);
    //         }
    //         l.add(str);
    //         return;

    //     }

    //     for(int row = 0; row<b.length; row++)
    //     {
    //         if(isSafe(row,col,b))
    //         {
    //             b[row][col] = 'Q';
    //             solve(l,b,col+1);
    //             b[row][col] = '.';            
    //         }
    //     }
    // }

    // private boolean isSafe(int row, int col, char[][] b) {
    //     int dRow=row,dCol = col;


    //     while(row >= 0 && col >= 0)
    //     {
    //         if(b[row][col] == 'Q')
    //             return false;
    //         row--;
    //         col--;
    //     }

    //     row = dRow;
    //     col = dCol; 

    //     while(col >= 0)
    //     {
    //         if(b[row][col] =='Q')
    //             return false;
    //         col--;
    //     }

        
        
    //     row = dRow;
    //     col = dCol;
    //     while(row < b.length && col >= 0)
    //     {
    //         if(b[row][col] == 'Q')
    //             return false;
    //         row++;
    //         col--;
    //     }

    //     return true;

    // }


    public List<List<String>> solveNQueens2(int n) {
        List<List<String>> l = new ArrayList<>();

        char [][]b = new char[n][n];

        for(int i = 0; i<b.length; i++)
        {
            for(int j = 0; j<b[i].length; j++)
            {
                b[i][j] = '.';
            }
        }

        int []leftRow = new int[n];
        int []lowerDiagonal = new int[2 * n - 1];
        int []upperDiagonal = new int[2 * n - 1];

        solve2(0,l,b,leftRow,lowerDiagonal,upperDiagonal);

        return l;
    } 


    private void solve2(int col, List<List<String>> l, char[][] b, int []r, int []low, int [] up)
    {
        if(col == b.length)
        {
            List<String> str = new ArrayList<>();

            for(int ind = 0; ind<b.length; ind++)
            {
                String s = new String(b[ind]);
                str.add(s);
            }
            l.add(str);
            return;
        }

        for(int row = 0; row < b.length; row++)
        {
            if(r[row] == 0 && low[row + col] == 0 && up[b.length - 1 + col - row] == 0)
            {
                b[row][col] = 'Q';
                r[row] = 1;
                low[row + col] = 1;
                up[b.length - 1 + col - row] = 1;
                solve2(col + 1, l,b,r,low,up);
                b[row][col] = '.';
                r[row] = 0;
                low[row + col] = 0;
                up[b.length - 1 + col - row] = 0;
            }
        }
    }

    public static void main(String []args)
    {
        System.out.println(new NQueens().solveNQueens2(4));
    }
}