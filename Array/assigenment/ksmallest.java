
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ksmallest
{
    public static void fun(int []a , int k)
    {
        List<Integer> m = new ArrayList<>();

        for(int i = 0; i<a.length; i++)
        {
            m.add(a[i]);
        }
        Collections.sort(m);
        System.out.println(m.get(k-1));
        System.out.println(m.get(a.length-k));
    }
    public static void main(String []args)
    {
        int []a = {2,3,1,5,4,6};
        fun(a,2);
        // for(int x : b)
        // {
        //     System.out.println(x);
        // }
        // System.out.println(b);
    }
}