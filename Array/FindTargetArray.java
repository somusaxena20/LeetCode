// Given array a and number x , find a pair (a,b) with equals to X

package Array;

import java.util.HashMap;

public class FindTargetArray
{
    public static void findSum(int []a, int target)
    {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i = 0; i<a.length; i++)
        {
            int req = target-a[i];

            if(h.containsKey(a[i]))
            {
                System.out.println(a[h.get(a[i])]+" "+a[i]);
            }
            h.put(req,i);
        }

        // return new int[]{-1,-1};
    }
    public static void main(String []args)
    {
        int []a = {1,4,3,3,5,2,6};
        findSum(a,9);

        // for(int x : b)
        // {
        //     System.out.println(x);
        // }
    }
}