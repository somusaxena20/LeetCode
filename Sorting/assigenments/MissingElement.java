package assigenments;

// 268. Missing Number
// https://leetcode.com/problems/missing-number/

public class MissingElement {
    public static int missingElement(int []a)
    {
        int i = 0;
        
        while(i < a.length)
        {
            int index = a[i];
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
        for(i = 0; i<a.length; i++)
        {
            if(i != a[i])
                return i;
        }
        return a.length;
    }
    public static void main(String []args)
    {
        // only in the rnage 0 to n
    }
}
