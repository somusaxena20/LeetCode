package Assignment;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/

public class SubsetSum2 {

    void subset(int i, int []a, List<List<Integer>> l, List<Integer> ds)
    {
        if(i == a.length)
        {
            if(!l.contains(ds))
            {
                l.add(new ArrayList<>(ds));
            }
            return;
        }
        
        subset(i+1,a,l,ds);
        ds.add(a[i]);
        subset(i+1,a,l,ds);
        ds.remove(ds.size()-1);
        
    }

    void subset2(int ind , int []a,List<List<Integer>> l, List<Integer> ds)
    {

        l.add(new ArrayList<>(ds));
        
        for(int i = ind; i<a.length; i++)
        {
            if(i != ind && a[i] == a[i-1])continue;
            ds.add(a[i]);
            subset2(i+1,a,l,ds);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        subset2(0,nums,l,new ArrayList<>());

        return l;
    }

    public static void main(String []args)
    {
        int []a = {1,2,2};
        List<List<Integer>>l = new SubsetSum2().subsetsWithDup(a);
        System.out.println(l);
    }
}
