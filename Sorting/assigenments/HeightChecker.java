package assigenments;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int []temp = new int[heights.length];
        for(int i = 0; i<temp.length; i++)
        {
            temp[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(temp);

        for(int i = 0; i<heights.length; i++)
        {
            if(heights[i] != temp[i])
            {
                count++;
            }
        }
        return count;

    }
    public static void main(String []args)
    {
        int []a = {1,1,4,2,1,3};
        System.out.println(heightChecker(a));
    }
}
