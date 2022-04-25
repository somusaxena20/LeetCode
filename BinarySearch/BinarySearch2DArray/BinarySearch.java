package BinarySearch2DArray;

public class BinarySearch {
    public int binarySearch(int []arr ,int start, int end, int target)
   {
       int s = start, e = end,mid=0;
       
       while(s <= e)
       {
           mid = s+(e-s)/2;
           if(arr[mid] == target)
           {
               return mid;
           }
           else if(arr[mid] < target)
           {
               s = mid+1;
           }
           else
           {
               e = mid-1;
           }
       }
       return -1;
   }
}
