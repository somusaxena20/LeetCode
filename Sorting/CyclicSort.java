public class CyclicSort {

    public static void cyclicSort(int []a)
    {
        int i = 0;
        while(i < a.length)
        {
            int c = a[i]-1;
            if(a[i] != a[c])
            {
                int temp = a[i];
                a[i] = a[c];
                a[c] = temp;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String []args)
    {
        int []a = {1,1,1,2,1};
        cyclicSort(a);
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
