package assigenments;


public class DisapperedNumber {
    public static void disappredNumber(int []a)
    {
        int i = 0;
        while(i < a.length)
        {
            int index = a[i]-1;
            if(a[i] == a.length)
                i++;
            else if(a[i] != a[index])
            {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
            else
            {
                i++;
            }
        }
        int b[] = a;
    }
    public static void main(String []args)
    {
        int []a = {4,3,2,7,8,2,3,1};
        disappredNumber(a);
    }
}
