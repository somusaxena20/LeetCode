package assigenments;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumSmallerThenCurrent {
    public static int[] smallerNumbersThanCurrent(int[] a) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int []t = a.clone();
        Arrays.sort(t);
        for(int i = 0; i<t.length; i++)
        {
            if(!h.containsKey(t[i]))
            {
                h.put(t[i],i);
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
    public static void main(String []args)
    {
        int []a = {8,1,2,2,3};
        a = smallerNumbersThanCurrent(a);
        System.out.println(Arrays.toString(a));
    }
}
