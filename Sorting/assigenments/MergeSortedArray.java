package assigenments;

// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public static void merge(int[] a, int m, int[] b, int n) {
        int j;
        
        for(int i = 0; i<b.length ; i++)
        {
            j = 0;

            if(a[i] >= a[j])
            {
                int t = m;
                while(j > 0 && t >= j)
                {
                    a[t] = a[t-1];
                    t--;
                }
                m++;
            }
            else
            {
                j++;
            }
        }


    }
    public static void main(String []args)
    {
        int []a = {1,2,3,0,0,0};
        int []b = {2,5,6};

        merge(a,3,b,3);
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
