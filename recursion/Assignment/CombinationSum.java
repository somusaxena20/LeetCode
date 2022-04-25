package Assignment;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int a[],int t) {
        List<List<Integer>> l = new ArrayList<>();
        comSum(a,t,0,l,new ArrayList<>());
        return l;
    }
    public static void comSum(int a[],int t, int i,List<List<Integer>> l,List<Integer> ds)
    {
        if(i == a.length)
        {
            if(t == 0)
                l.add(new ArrayList<>(ds));
            return;
        }
        if(t <= a[i])
        {
            ds.add(a[i]);
            comSum(a,t-a[i],i,l,ds);
            ds.remove(ds.size()-1);
            return;
        }
        

        
        comSum(a,t,i+1,l,ds);
    }
    public static void main(String []args)
    {
        int []a = {2,3,6,7};
        System.out.println(combinationSum(a,7));
    }
}
