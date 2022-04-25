import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int []a)
    {
        if(a.length == 1)
            return a;
        
        int mid = a.length/2;
        int []l = mergeSort(Arrays.copyOfRange(a,0,mid));
        int []r = mergeSort(Arrays.copyOfRange(a,mid,a.length));
        return merge(l,r);
    }

    static int[] merge(int []a, int []b)
    {
        int i,j,k;
        int []x = new int[a.length + b.length];

        i = j = k = 0;

        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                x[k++] = a[i++];
            }
            else
            {
                x[k++] = b[j++];
            }
        }

        for(;i<a.length; i++)
        {
            x[k++] = a[i];
        }
        for(;j<b.length; j++)
        {
            x[k++] = b[j];
        }
        return x;
    }

    public static void inPlaceMergeSort(int []a, int s,int e)
    {
        if(e -s == 1)
        {
            return;
        }
            int mid = (s+e)/2;
            inPlaceMergeSort(a,s,mid);
            inPlaceMergeSort(a,mid,e);
            inPlaceMerge(a,s,mid,e);
        
    }

    
    static void inPlaceMerge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
    
    public static void iMerge(int []A, int l,int mid,int h)
    {
        int i = l, j = mid, k = 0;
        int B[] = new int[h-l];
    
        while (i < mid && j < h)
        {
            if (A[i] < A[j])
                B[k++] = A[i++];
            else
                B[k++] = A[j++];
        }
        for (; i < mid; i++)
            B[k++] = A[i];
        for (; j < h; j++)
            B[k++] = A[j];
    
        for (i = l; i < B.length; i++)
            A[i] = B[i];
    }

    public static void iterativeMergeSort(int []a)
    {
        int p, l, h, mid, i;

        for (p = 2; p <= a.length; p = p * 2)
        {
            for (i = 0; i + p - 1 <= a.length; i = i + p)
            {
                l = i;
                h = i + p - 1;
                mid = (l + h) / 2;
                iMerge(a, l, mid, h);
            }
        }
        if (p / 2 < a.length)
            iMerge(a, 0, p / 2 - 1, a.length);
    }

    public static void main(String []args)
    {
        int []a = {10,7,1,2,4,6,8};
        inPlaceMergeSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
}
