// Q. Squares_of_a_Sorted_Array

import java.util.Arrays;


public class Squares_of_a_Sorted_Array {
    public static void squareSorted(int nums[])
    {
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] *= nums[i] ;
        } 
        Arrays.sort(nums);
    }
    public static void main(String args[])
    {
        int N[] = {-4,-1,0,3,10};
        squareSorted(N);
    }
}
