// Q Duplicate Zeros

public class Duplicate_Zeros {
    public static void duplicateZeros(int nums[])
    {
        int j;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                j = nums.length-1;
                while(j > i)
                {
                    nums[j] = nums[j-1];
                    j--;
                }
                i++;
            }
            
        }
    }
    public static void main(String args[])
    {
        int N[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(N);
        
    }

}