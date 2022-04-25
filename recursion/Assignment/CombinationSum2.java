package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void findCom(int ind, int []a, int t, List<List<Integer>> ans, List<Integer> ds)
    {
        if(t == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i<a.length; i++)
        {
            if(i > ind && a[i] == a[i-1])
                continue;
            
            if(a[i] > t)
                break;
            
            ds.add(a[i]);
            findCom(i+1,a,t-a[i],ans,ds);
            ds.remove(ds.size()-1);
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> l = new ArrayList<>();
        findCom(0,candidates,target,l,new ArrayList<>());
        return l;
    }
    
    public static void main(String []args)
    {
        // int []a = {10,1,2,7,6,1,5};
        // List<List<Integer>> l = combinationSum2(a,8);
    }
}
