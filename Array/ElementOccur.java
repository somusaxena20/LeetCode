// Given a sorted array A size of N , find an element that occurs more than N/2 times

package Array;

public class ElementOccur {

    // By linear search TC : O(n) 
    public static int[] occursElement(int []a)
    {
        
        int k=0; // retunring array index
        int n = (a.length/2)-1; // check for occurance
        int i = 0;
        int []x = new int[n/2]; // for return result in array
        while(i < a.length)
        {
            if(i+(n-1)<a.length && a[i] == a[i+(n-1)])
            {
                x[k++] = a[i];
                i = i+n;
            }
            else
            {
                i++;
            }
        }
        return x;
    }

    public static int occursElementMoore(int []a)
    {
        int majorityIndex = 0,vote=1;

        for(int i = 1; i<a.length; i++)
        {
            if(a[i] == a[majorityIndex])
            {
                vote++;
            }
            else
            {
                vote--;
            }
            if(vote == 0)
            {
                majorityIndex = i;
                vote = 1;
            }
        }

        int n = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(a[i] == a[majorityIndex])
            {
                n++;
            }
        }
        if(n > a.length/2)
        {
            return a[majorityIndex];
        }
        else
        {
            return -1;
        }
    }

    public static void main(String []args)
    {
        int []a = {1,1,1,1,3,4};
        System.out.println(occursElementMoore(a));

        // for(int x : b)
        // {
        //     System.out.println(x);
        // }
    }
}
