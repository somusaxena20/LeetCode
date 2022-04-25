package assigenments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Sum3
{
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet <List<Integer>> res = new HashSet<>();

        if(nums.length < 3)
        {
            return new ArrayList<>(res);
        }
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++)
        {
            int j = i+1,k = nums.length-1;


            while(j < k)
            {
                int sum = nums[i] + nums[j] +  nums[k];

                if(sum == 0)
                {
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum < 0)
                    j++;
                else
                    k--;
            }

        }
        return new ArrayList<>(res);

    }
    public static void main(String []args)
    {
        int []a = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(a));
    }
}