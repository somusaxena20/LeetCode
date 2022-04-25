package assigenments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-3; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                int s = j+1,e= nums.length-1; 
                while(s <= e)
                {
                    int sum = nums[i]+nums[j]+nums[s]+nums[e];

                    if(sum > target)
                    {
                        e--;
                    }
                    else if(sum < target)
                    {
                        s++;
                    }
                    else
                    {
                        l.add(Arrays.asList(nums[i],nums[j],nums[s],nums[e]));
                    }
                }
            }
        }

        return l;
    }
    public static void main(String []args)
    {
        int []a = {1,0,-1,0,-2,2};
        System.out.println(fourSum(a,0));
    }
}
