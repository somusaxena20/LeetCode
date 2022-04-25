package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Permiutation{

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();

        boolean h[] = new boolean[nums.length];

        findPer(l,new ArrayList<>(),h,nums);

        return l;
    }

    public void findPer(List<List<Integer>> ans, List<Integer> ds, boolean []c,int []a)
    {

        if(ds.size() == a.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i<a.length; i++)
        {
            if(!c[i])
            {
                c[i] = true;
                ds.add(a[i]);
                findPer(ans,ds,c,a);
                ds.remove(ds.size()-1);
                c[i] = false;
            }
        }
    }

    public void findPer2(List<List<Integer>> ans, int []a, int ind)
    {

        if(ind == a.length)
        {
            List<Integer> l = new ArrayList<>();

            for(int i = 0; i<a.length; i++)
            {
                l.add(a[i]);
            }
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i = ind; i<a.length; i++)
        {
            // swap();
        }
    }

    public static void main(String []args)
    {
        int []a = {1,2,3};
        System.out.println(new Permiutation().permute(a).get(5));
    }
}