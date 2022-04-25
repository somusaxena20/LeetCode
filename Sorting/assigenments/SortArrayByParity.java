package assigenments;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int []result = new int[nums.length];
        int j = 0, k = nums.length-1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                result[j++] = nums[i];
            }
            else
            {
                result[k--] = nums[i];
            }
        }
        return result;
    }
    public static int[] sortArrayByParity2(int[] nums) {
        int i = 0, k = nums.length-1;
        
        while(i < nums.length && i < k)
        {
            if(nums[i] % 2 == 0)
            {
                i++;
            }
            else
            {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
                k--;
            }
        }
        return nums;
    }
    public static void main(String []args)
    {
        int []a = {3,1,2,4};
        a = sortArrayByParity2(a);
        System.out.println(Arrays.toString(a));
    }
}
