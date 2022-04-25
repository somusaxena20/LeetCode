package assigenments;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] a) {
        
        Arrays.sort(a);

        for(int i = 2; i<a.length; i++)
        {
            if(a[i-1]-a[i-2] != a[i]-a[i-1])
            {
                return false;
            }
        }
        
        
        return true;        
    }
    public static void main(String []args)
    {
        int []a = {3,5,1};
        System.out.println(canMakeArithmeticProgression(a));
    }
}
