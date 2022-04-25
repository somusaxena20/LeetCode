// https://leetcode.com/problems/split-array-largest-sum/

package BinarySearch;

public class SplitArrayLargestSum {
    public static int splitArray(int []a,int m)
    {
        int s = 0,e =0;

        for(int i = 0; i<a.length; i++)
        {
            s = Math.max(s,a[i]);
            e = e+a[i];
        }

        while(s < e)
        {
            int mid = s +(e - s)/2;

            int sum = 0,pices = 1;

            for(int x : a)
            {
                if(sum + x > mid)
                {
                    sum = x;
                    pices++;
                }
                else
                {
                    sum+=x;
                }
            }
            if(pices > m)
            {
                s = mid +1;
            }
            else
            {
                e = mid;
            }

        }

        return e;
    }

    public static void main(String []args)
    {
        int []a = {7,2,5,10,8};
        System.out.println(splitArray(a,2));

    }
}
