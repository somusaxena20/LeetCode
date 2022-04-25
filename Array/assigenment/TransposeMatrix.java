public class TransposeMatrix {
    public static int[][] transpose(int[][] a) {
        int [][]b = new int[a.length][a[0].length];

        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                b[j][i] = a[i][j];
            }

        }
        return b;
    }
    // public static int[][] transpose(int [][]a)
    // {
    //     int temp = 0,i;

    //     for(i = 0; i<a.length; i++)
    //     {
    //         temp = a[i][0];
    //         a[i][0] = a[0][i];
    //         a[0][i] = temp;
    //     }
    //     for(int j = i-1; j>0; j--)
    //     {
    //         temp = a[j][1];
    //         a[j][1] = a[1][j];
    //         a[1][j] = temp;
    //     }
    //     return a;
    // }
    public static void main(String []args)
    {
        int [][]a = {{2,4,-1},{-10,5,11},{18,-7,6}};

        for(int []x : transpose(a))
        {
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
