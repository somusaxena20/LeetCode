

package BinarySearch;


public class ArrayProblem {
    public static int longestSumArray(int []a)
    {
        int  max = Integer.MIN_VALUE,sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            
            max = Math.max(sum,max);
            
            if(sum < 0)
            {
                sum = 0;
            }
        }
        
        return max;
    }
    public static void main(String [] args)
    {
        int []arr = {1,2,2,3,1};
        System.out.println(longestSumArray(arr));
    }
}
