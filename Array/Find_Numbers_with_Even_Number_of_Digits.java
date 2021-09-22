// Q. Find Numbers with Even Number of Digits

class Find_Numbers_with_Even_Number_of_Digits
{
    public static int evenNumber(int nums[])
    {
        int even=0,temp,j=0;

        for(int i = 0; i < nums.length; i++)
        {
            temp = nums[i];
            j = 0;
            while(temp > 0)
            {
                temp = temp/10;
                j++;
            }
            if(j % 2 == 0)
                even++;
        }

        return even;

            // EXPERT CODE

        // int counter=0;

        // for(Integer x : nums)
        // {
        //     if(x.toString().length() % 2 == 0)
        //     {
        //         counter++;
        //     }
        // }
        // return counter;
    }

    public static void main(String args[])
    {
        int N[] = {555,901,4825,1771};
        System.out.println(evenNumber(N)); 
    }
}