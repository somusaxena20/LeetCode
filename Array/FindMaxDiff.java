// Find largest diffrence between two number in array such that largest number appers after smaller.

package Array;

public class FindMaxDiff {

    public static int findMaxDiff(int []a)
    {
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++)
        {
            for(int j = i+1; j < a.length; j++)
            {
                if(a[i] < a[j])
                {
                    if(maxDiff < a[i]-a[j])
                    {
                        maxDiff = a[i] - a[j];
                    }
                }
            }

        }


        return maxDiff;
    }

    public static int findMaxDiff2(int []a)
    {
        int []diff = new int[a.length-1]; //Maintain diffrence array

        for(int i = 0; i<a.length-1; i++)
        {
            diff[i] = a[i+1]-a[i];
        }

        int maxDiff = diff[0];

        for(int j = 1; j<diff.length; j++)
        {
            if(diff[j-1] > 0)
            {
                diff[j] = diff[j] + diff[j-1];
                maxDiff = Math.max(maxDiff,diff[j]); 
            }
        }

        return maxDiff;
    }

    public static int findMaxDiff3(int []a)
    {
        int min = a[0];
        int maxDiff = a[1]-a[0];
        int currDiff = a[1]-a[0];

        for(int i = 1; i<a.length; i++)
        {
            if(a[i] < min)
                min = a[i];
            else
            {
                currDiff = a[i] - min;
                if(currDiff > maxDiff)
                {
                    maxDiff = currDiff;
                }
            }
        }
        return maxDiff;
    }

    public static void main(String []args)
    {
        int []a = {3,6,9,1};
        System.out.println(findMaxDiff3(a));
    }
}
