public class SelectionSort {
    public static int[] selectionSort(int []a)
    {
        for(int i = 0; i<a.length-1; i++)
        {
            int last = a.length - i- 1;
            int maxIndex = maxElementIndex(a,i,last);
            swap(a,i,maxIndex);
        }

        return a;
    }
    static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
    static int maxElementIndex(int []a, int s, int e)
    {
        int max=0;

        for(int i = s; i<=e; i++)
        {
            if(a[i] < a[max])
            {
                max = i;
            }
        }
        return max;
    }
    public static void main(String []args)
    {
        int []a = {5,6,3,2,1};
        selectionSort(a);
    }
}
