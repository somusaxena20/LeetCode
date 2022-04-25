package assigenments;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray
{
    public static int[] arrayRankTransform(int[] a) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int []t = a.clone();
        Arrays.sort(t);
        int k = 1;
        for(int i = 0; i<t.length; i++)
        {
            if(!h.containsKey(t[i]))
            {
                h.put(t[i],k++);
            }
        }

        for(int j = 0; j<a.length; j++)
        {
            if(h.containsKey(a[j]))
            {
                a[j] = h.get(a[j]);
            }
        }
        return a;
    }
    // static int getIndex(int []a)
    // {
    //     int []t = a.clone();

    //     Arrays.sort(t);
    //     return t.length-1;
    // }
    public static void main(String []args)
    {
        int []a = {40,10,20,30};
        a = arrayRankTransform(a);
        System.out.println(Arrays.toString(a));
    }
}