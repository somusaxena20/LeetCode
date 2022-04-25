package BinarySearch;

public class BinarySearchProblems {
    
//    1 Celing of a number
    
    public int findCeling(int []arr, int target)
    {
        int s = 0, e = arr.length-1,mid=0;
        
        while(s <= e)
        {
            mid = s+(e-s)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return s;
    }
    
    public int celingOfNumber(int []arr, int target)
    {
       return arr[findCeling(arr,target)];
    }
    
//    Two Sum II - Input Array Is Sorted
//    link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    
    public int[] twoSum(int []arr, int target)
    {
        int s = 0, e = arr.length-1;
        
        while(s < e)
        {
            if(arr[s] + arr[e] < target)
            {
                s++;
            }
            else if(arr[s] + arr[e] > target)
            {
                e--;
            }
            else
            {
                return new int[]{s, e};
            }
        }
        
        return new int[]{-1, -1};
    }
    
//    find smallest letter greater then target
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    
    public char nextGreatestLetter(char[] letters, char target) {
       
        int s = 0, e = letters.length-1,mid=0;
        
        while(s <= e)
        {
            mid = s + (e-s)/2;
            if(target < letters[mid])
            {
                e = mid -1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return letters[s%letters.length];
    }
    
    
//    34. Find First and Last Position of Element in Sorted Array
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    
//    public int[] searchRange(int[] num, int target) {
//        
//        int []ans = {-1,-1};
//        
//        int start = search(num, target, true);
//        int end = search(num, target, false);
//        
//        ans[0] = start;
//        ans[1] = end;
//        
//        return ans;
//    }

//    int search(int[] num, int target, boolean b) {
//        int ans = 0;
//        int s =0,e = num.length-1,mid = 0;
//        
//        while(s <= e)
//        {
//            mid = s +(e-s)/2; 
//            if(target < num[mid])
//            {
//                e = mid -1;
//            }
//            else if(target > num[mid])
//            {
//                s = mid + 1;
//            }
//            else
//            {
//                ans = mid;
//                if(b)
//                {
//                    e = mid - 1;
//                }
//                else
//                {
//                    s = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
    
//    Find position of an element in a sorted array of infinite numbers
//    https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    
    
//    public int searchInfinte(int []arr, int target)
//    {
//        int s = 0,e=1;
//        while(arr[e] < target)
//        {
//            int temp = e+1;
//            e = e+(e-s+1)*2;
//            s = temp;
//        }
//        
//        return binarySearch(arr,s,e,target);
//    }
//    
//    
//    public int binarySearch(int []arr ,int start, int end, int target)
//    {
//        int s = start, e = end,mid=0;
//        
//        while(s <= e)
//        {
//            mid = s+(e-s)/2;
//            if(arr[mid] == target)
//            {
//                return mid;
//            }
//            else if(arr[mid] < target)
//            {
//                s = mid+1;
//            }
//            else
//            {
//                e = mid-1;
//            }
//        }
//        return -1;
//    }
    
//    852. Peak Index in a Mountain Array
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
    
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0,end = arr.length-1,mid =0;
        
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1])
            {
                if(arr[mid-1] > arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    return mid;
                }
            }
            else if(arr[mid] < arr[mid + 1])
            {
                start = mid+1;
            }
        }
        return -1;
    }
    
//    find Pivot (largest element in array)
    
    public int pivot(int []arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    // search in rotated sorted array
    
    public int searchInRotated(int []nums, int target)
    {
        int p = pivot(nums);
        
        if (p == -1) {
            return binarySearch(nums,target,0,nums.length);
        }
        
        if (p == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[p] == target) {
            return p;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, p - 1);
        }

        return binarySearch(nums, target, p + 1, nums.length - 1);
        
    }
    
    public int binarySearch(int []arr ,int target,int start, int end)
    {
        int s = start, e = end-1,mid=0;
        
        while(s <= e)
        {
            mid = s+(e-s)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return -1;
    }
    
}
