public class BubbleSort {

    public static int[] bubbleSortByMax(int []a,int k)
    {
        int temp;
        boolean flag;
        for(int i = 0; i<a.length-1; i++)
        {
            flag = false;
            for(int j = 0; j<a.length-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if(flag == false)
            {
                break;
            }
        }
        return a;
    }
    public static int[] bubbleSortByMin(int []a,int k)
    {
        int temp;
        boolean flag;

        for(int i = a.length-1; i>=0; i--)
        {
            flag = false;
            for(int j = i; j >=0; j--)
            {
                if(a[j] < a[j-1])
                {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = true;
                }
            }
            if(flag == false)
            {
                break;
            }
        }

        return a;
    }
    public static void main(String []args)
    {
        int []a = {5,6,3,2,1};
        bubbleSortByMin(a,2);
    }
}
