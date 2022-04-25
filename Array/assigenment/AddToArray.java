import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AddToArray {
    public static List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int i=nums.length-1;
        while(i>=0 || k>0)
        {
            if(i>=0)
                k=k+nums[i];
            list.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String []args)
    {
        int []a ={9,9,9,9,9,9,9,9,9,9};
        List l = addToArrayForm(a,1
        );

        // for(Object x : l)
        // {
        //     System.out.println(Integer.parseInt(x));
        // }
    }
}
