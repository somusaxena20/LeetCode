public class DiagonalMatrixSum {

    public static int sumDiagonal(int [][]a)
    {
        int sum = 0;

        for(int i = 0; i<a.length; i++)
        {
            sum += a[i][i]+a[i][a.length-i-1];
        }

        if(a.length % 2 != 0)
        {
            sum = sum - a[a.length/2][a.length/2];
        }

        return sum;
    }

    public static void main(String []args)
    {
        int [][]a = {{1,2,3},
            {4,5,6},
            {7,8,9}};

        System.out.println(sumDiagonal(a));
    }
}
