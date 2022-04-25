package assigenments;

import java.util.Arrays;

public class Closest3Sum {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minTN = Integer.MAX_VALUE;
        int res = -1;
        for(int i = 0; i<nums.length-2; i++)
        {
            int j = i+1,k = nums.length-1;


            while(j < k)
            {
                int sum = nums[i] + nums[j] +  nums[k];
                int dif = Math.abs(sum-target);

                if(dif < minTN)
                {
                    minTN = dif;
                    res = sum;
                }

                if(sum > target)
                {
                    k--;
                }
                else if(sum < target)
                    j++;
                else
                    return target;
            }

        }
        return res;
    }

    public static int thirdCloset(int nums[], int target)
    {
        Arrays.sort(nums);





        return binarySearch(nums,target);
    }

    public static int binarySearch(int []a, int target)
    {
        Arrays.sort(a);
        int s = 0,e = a.length-1;

        while(s < e)
        {
            int  mid = s+(e-s)/2;
            if(a[mid] < target)
            {
                s = mid+1;
            }
            else if(a[mid] > target)
            {
                 e = mid -1;
            }
            else
            {
                return a[mid];
            }
        }
        if(s == a.length)
            return a[e];
        else
            return a[s];
    }

    public static void main(String []args)
    {
        int []a = {-1,2,1,-4};
        // -4 -1 1 2
        System.out.println(threeSumClosest(a,1));
    }
}
