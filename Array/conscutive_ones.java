class conscutive_ones {
     public static int findMaxConsecutiveOnes(int[] nums) {
        int temp,one,j;
        
        temp = one = 0;
        
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                j = i;
                while(j < nums.length && nums[j] == 1)
                {
                    j++;
                }
                temp = j-i;
                i = j-1;
            }
            if(one < temp)
                one = temp;
            
        }
        return one;
        
    }
    public static void main(String args[])
    {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
