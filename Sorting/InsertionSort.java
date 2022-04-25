public class InsertionSort
{
    public static int[] insertionSort(int []a)
    {
        for(int i = 1; i<a.length; i++)
        {
            int j = i;
            while(j > 0)
            {
                if(a[j-1] > a[j])
                {
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                    j--;
                }
                else 
                {
                    break;
                }
              
            }

        }
        return a;
    }
    public static void main(String []args)
    {
        int []a = {4,3,2,7,8,2,3,1};
        insertionSort(a);
    }
}