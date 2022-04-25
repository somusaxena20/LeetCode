package assigenments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                l.add(nums[i]);
                l.add(i+1);
            }
        }
        int []t = new int[l.size()];
        for(int i = 0; i<t.length; i++)
        {
            t[i] = l.get(i);
        }
        return t;
    }
    public static void cyclicSort(int []a)
    {
        int i = 0;
        while(i < a.length)
        {
            int c = a[i]-1;
            if(a[i] != a[c])
            {
                int temp = a[i];
                a[i] = a[c];
                a[c] = temp;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String []args)
    {
        int []a = {1,2,2,4};
        a = findErrorNums(a);
        System.out.println(Arrays.toString(a));
    }
}
