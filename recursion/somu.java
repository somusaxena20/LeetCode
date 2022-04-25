import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class somu {

    public static void ss(int []a, List<Integer> l, int index, int sum, int target,List<List<Integer>> ans)
    {
        if(sum > target)
            return;
        if(index == a.length)
        {
            if(sum == target)
            {
                if(!ans.contains(l))
                    ans.add(new ArrayList<>(l));
            }
            return ;
        }
        l.add(a[index]);
        ss(a,l,index+1,sum+a[index],target,ans);
        l.remove(l.size()-1);
        ss(a,l,index+1,sum,target,ans);
    }

    public static void main(String []args)
    {
        int []a = {10,1,2,7,6,1,5};
        
        Arrays.sort(a);
        List<List<Integer>> l = new ArrayList<>();
        ss(a,new ArrayList<>(),0,0,8,l);
        
        
        System.out.println(l);
        
    }
}
