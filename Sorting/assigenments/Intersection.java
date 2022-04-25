package assigenments;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Intersection {

    public static boolean binarySearch(int []a, int s, int e,int target)
    {
        int mid = 0;

        while(s <= e)
        {
            mid = s +(e - s)/2;

            if(a[mid] == target)
                return true;
            else if(a[mid] < target)
                s = mid + 1;
            else
                e = mid -1;
        }
        return false;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums2);
        for(int i = 0; i<nums1.length; i++)
        {
            if(binarySearch(nums2,0,nums2.length-1,nums1[i]))
            {
                if(!l.contains(nums1[i]))
                {
                    l.add(nums1[i]);
                }
            }
        }
        int []a = new int[l.size()];

        for(int p = 0; p<l.size(); p++)
        {
            a[p] = l.get(p);
        }

        return a;

    }
    public static void main(String []args)
    {
        int []a = {1};
        int []b = {1};
        int []c = intersection(a,b);
        System.out.println(Arrays.toString(c));
    }
}
