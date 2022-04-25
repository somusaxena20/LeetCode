import java.util.Arrays;
public class QuickSort {

    public static int partition(int []a, int s, int e)
    {
        int pivot = a[s];
        int i = s, j = e;

        while(i < j)
        {
            while(i < j && a[i] <= pivot)
            {
                i++;
            }
            while(a[j] > pivot)
            {
                j--;
            }
            if(i < j)
            {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[s];
        a[s] = a[j];
        a[j] = t;
        return j;
    }

    // public static int partition2(int []nums, int low, int hi)
    // {
    //     int s = low;
    //     int e = hi;
    //     int m = s + (e - s) / 2;
    //     int pivot = nums[m];

    //     while (s <= e) {

    //         // also a reason why if its already sorted it will not swap
    //         while (nums[s] < pivot) {
    //             s++;
    //         }
    //         while (nums[e] > pivot) {
    //             e--;
    //         }

    //         if (s <= e) {
    //             int temp = nums[s];
    //             nums[s] = nums[e];
    //             nums[e] = temp;
    //             s++;
    //             e--;
    //         }
    //     }
    // }

    public static void quickSort(int []a, int s, int e)
    {
        if(s < e)
        {
            int j = partition(a,s,e);
            quickSort(a,s,j-1);
            quickSort(a,j+1,e);
        }
    }
    public static void sort(int []nums, int low, int hi)
    {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }

    public static void main(String []args)
    {
        int []a = {57, 38, 91, 10, 38, 28, 79, 41};
        // 10 20 30 40 50 60 70 80 90 
        // quickSort(a,0,a.length-1);
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }    
}
