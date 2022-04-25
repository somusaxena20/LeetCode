package Assignment;

public class SumOfNnumbers{
    // static int sum = 0;
    public static void sumOfNnumber(int i, int sum)
    {
        if(i < 1)
        {
            System.out.println(sum);
            return ;
        }
        sumOfNnumber(i-1, sum+i);
    }

    public static int sumOfNumber2(int i)
    {
        if(i < 1)
            return 0;
        return i + sumOfNumber2(i-1);
        
    }
    public static void main(String []args)
    {
        System.out.println(sumOfNumber2(5));
    }
}