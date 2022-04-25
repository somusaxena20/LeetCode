public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] a) {
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j] == 0)
                {
                    a[i][j] = 1;
                }
                else
                {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
    public static void main(String []args)
    {
        int [][]a = {{1,1,0},{1,0,1},{0,0,0}};
        
        for(int []x : flipAndInvertImage(a))
        {
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
