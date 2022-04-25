package Assignment;



public class BasicRecursionProblem {
    public static void f123(int i, int n)
    {
        if(i > n)
            return;
        System.out.println("SOMU");
        f123(++i,n);
    }
    public static void back123(int i, int n)
    {
        if(i < 1)
            return;
        back123(i-1,n);
        System.out.println(i);
    }
    public static void back321(int i, int n)
    {
        if(i > n)
            return;
        back321(i+1,n);
        System.out.println(i);
    }

    // FACTORIAL PROGRAM

    public static int factorial(int n)
    {
        if(n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // REVERSE AN ARRAY

    public static void reverse(int []a, int i, int j)
    {
        if(i == j)
            return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        reverse(a,i+1, j-1);
    }
    public static void reverse2(int []a, int i, int n)
    {
        if(i >= n/2)
            return;
        int temp = a[i];
        a[i] = a[n-i];
        a[n-i] = temp;
        reverse2(a,i+1, n);
    }

    // CHECK THE STRING IS PALLINDROM

    public static boolean checkPalindrom(String s, int i)
    {
        if(i < s.length()/2)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
            return checkPalindrom(s,i+1);
        }
        return true;
    }

    public static int fibbo(int i)
    {
        if(i <= 1)
            return i;
        return fibbo(i-1) + fibbo(i-2);
    }

    public static void main(String []args)
    {
        // int []a = {1,2,3,4,5};
        // String s = "aba";
        
        System.out.println(fibbo(4));
    }
}
