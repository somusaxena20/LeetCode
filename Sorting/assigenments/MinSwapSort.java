package assigenments;

public class MinSwapSort {
    public static int minSwapSort(int []a)
    {
        int swap = 0;
        for(int j = 1; j<a.length; j++)
      {
          int i = j;
          while(i > 0)
          {
            if(a[i-1] > a[i])
            {
               int temp = a[i];
               a[i] = a[i-1];
               a[i-1] = temp;
               i--;
               swap++;
            }
            else
            {
               break;
            }
          }
      }
      return swap;
        
    }
    public static void main(String []args)
    {
        int []nums = {2, 8, 5, 4};
        minSwapSort(nums);
    }
}
