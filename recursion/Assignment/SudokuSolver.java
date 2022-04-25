package Assignment;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char [][]b)
    {
        for(int i = 0; i<b.length; i++)
        {
            for(int j = 0; j<b[0].length; j++)
            {
                if(b[i][j] == '.')
                {
                    for(char c = '1';c<='9';c++)
                    {
                        if(isValid(b,i,j,c))
                        {
                            b[i][j] = c;
                            if(solve(b))
                            {
                                return true;
                            }
                            else
                            {
                                b[i][j] = '.';
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }



    private boolean isValid(char[][] b, int i, int j, char c) {
        for(int x = 0; x<9; x++)
        {
            if(b[x][j] == c)
                return false;

            if(b[i][x] == c)
                return false;

            if(b[3 * (i / 3) + x / 3][3 * (j / 3)+ x % 3] == c)
                return false;
        }
        return true;
    }

    public static void main(String []args)
    {

    }
}
