package assigenments;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection2 {
    public static int[] intersection2(int []nums1, int []nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []a = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++)
        {
            a[k] = ans.get(k);
        }
        return a;
    }

    public static void main(String []args)
    {
        int []a = {1,2,2,1};
        int []b = {2,2};
        int []c = intersection2(a,b);
        System.out.println(Arrays.toString(c));
    }
}
