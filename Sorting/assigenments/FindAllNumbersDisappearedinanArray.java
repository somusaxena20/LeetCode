package assigenments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
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
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> l = new ArrayList<>();   

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]-1 != i)
                l.add(i+1);
        }
        return l;
    }
    public static void main(String []args)
    {
        int []a = {4,3,2,7,8,2,3,1};
        // cyclicSort(a);
        System.out.println(findDisappearedNumbers(a));
    }
}
