package BinarySearch;

public  class CountRotationArray {

    public static int findPivot(int []a)
    {
        int s = 0,e = a.length-1;

        while(s <=  e)
        {
            int mid = s + (e-s)/2;

            if(mid < e && a[mid] > a[mid + 1])
                return mid+1;
            
            if(a[mid] < a[mid -1])
            {
                return mid;
            }

            if(a[mid] == a[s] && a[mid] == a[e])
            {
                if(a[s] > a[s+1])
                {
                    return s+1;
                }
                s++;
                if(a[e] < a[e-1])
                {
                    return e;
                }
                e--;
            }
            else if(a[s] < a[mid] || (a[s] == a[mid] && a[mid] > a[e]))
            {
                s = mid + 1;
            }
            else
            {
                e = mid -1;
            }

        }


        return 0;
    }
    public static void main(String []args)
    {
        int [] a = {1, 2, 3, 4, 5};
        System.out.println(findPivot(a));
    }
}
