

package BinarySearch;


public class SearchInRotatedArray {
    
    
    public static int binarySearch(int []nums, int target, int s, int e)
    {
        
        while(s <= e)
        {
            int mid = s + (e - s)/2;
            
            if(nums[mid] < target)
            {
                s = mid + 1;
            }
            else if(nums[mid] > target)
            {
                e = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    public static int findPivot(int []nums)
    {
        int s = 0, e= nums.length-1;
        
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            
            if( mid < e && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            
            if(mid > s && nums[mid] < nums[mid-1])
            {
                return mid -1;
            }
            
            if(nums[mid] > nums[s])
            {
                s = mid + 1;
            }
            else
            {
                e = mid -1;
            }
            
        }
        return -1;
        
    }
    
    public static int searchInRotatedArray(int []nums, int target)
    {
        int pivot = findPivot(nums);
        
        if(pivot == -1)
        {
            return binarySearch(nums, target,0,nums.length-1);
        }
        
        if(nums[pivot] == target)
        {
            return pivot;
        }
        
        if(target >= nums[0])
        {
            return binarySearch(nums,target,0,pivot-1);
        }
        else
        {
            return binarySearch(nums,target,pivot, nums.length-1);
        }
        
    }

    public static int findPivotWithDuplicate(int []a)
    {
        int s = 0,e = a.length-1;

        while(s <= e)
        {
            int mid = s +(e-s)/2;

            if(s < mid && a[mid] > a[mid+1])
                return mid;
            
            if(e > mid && a[mid] < a[mid -1])
                return mid-1;

            if(a[s] == a[mid] && a[mid] == a[e])
            {
                if(s < e && a[s] > a[s+1])
                {
                    return s;
                }                

                s++;
                if(e > s && a[e] < a[e-1])
                {
                    return e-1;
                }
                e--;
            }
            else if(a[s] < a[mid] || (a[s] == a[mid] && a[mid] > a[e]))
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }

        }


        return -1;

    }

    
    public static void main(String []args)
    {
        int []a = {2,4,4,5,1,2};
        System.out.println(findPivotWithDuplicate(a));
    }
}
