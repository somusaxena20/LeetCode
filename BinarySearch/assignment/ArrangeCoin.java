package assignment;

// https://leetcode.com/problems/arranging-coins/

public class ArrangeCoin {
    public static int arrangeCoins(int n) {
        
        // Iterative solution
        
        // int i = 0,req = 1;
        // while(n >= req)
        // {
        //     i++;
        //     n = n - req;
        //     req++;
            
        // }
        // return i;

        long s = 0, e = n;

        while(s <= e)
        {
            long mid = s + (e -s)/2;
            long used = mid * (mid + 1)/2;

            if(used == n)
            {
                return (int)mid;
            }

            if(used > n)
            {
                e = mid -1;
            }
            else
            {
                s = mid +1;
            }

        }
        return (int)e;
    }
    public static void main(String []args)
    {
        System.out.println(arrangeCoins(5));
    }
}
