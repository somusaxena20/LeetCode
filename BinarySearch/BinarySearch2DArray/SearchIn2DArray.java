package BinarySearch2DArray;

public class SearchIn2DArray {

    public static boolean searchIn2DArray(int [][]a,int target)
    {
        int n = a[0].length;
        int x;
        for(int i = 0; i<a.length; i++) //TC - O(n)
        {
            if (a[i][n - 1] >= target && a[i][0] <= target) {
                x = binarySearch(a[i], 0, n - 1, target); // log(n)
                if (x != -1)
                {
                     return true;  
                }
            }
        }
        return false;
    } 
    // TC - O(Nlogn)

    public static int[] searchIn2DArray2(int [][]matrix, int target)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int start = 0;
        int end = m*n -1;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            int row = mid/n;
            int col = mid%n;
            
            if(matrix[row][col] == target) {
                return new int[]{row,col};
            } else if(matrix[row][col] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int binarySearch(int []arr ,int start, int end, int target)
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
    public static void main(String []args)
    {
        int [][]a={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int []b = searchIn2DArray2(a,16);
    }
}
