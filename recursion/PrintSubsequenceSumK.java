import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PrintSubsequenceSumK {
    public static void printSubsequenceK(int []a, List<Integer> l, int index, int sum, int target )
    {
        if(index == a.length)
        {
            if(sum == target)
            {
                System.out.println(l);
            }
            return ;
        }
        l.add(a[index]);
        printSubsequenceK(a,l,index+1,sum+a[index],target);
        l.remove(l.size()-1);
        printSubsequenceK(a,l,index+1,sum,target);
        
    }

    public static boolean printSubsequenceKOne(int []a, List<Integer> l, int index, int sum, int target )
    {
        if(index == a.length)
        {
            if(sum == target)
            {
                System.out.println(l);
                return true;
            }
            else
                return false;
        }
        l.add(a[index]);
        if(printSubsequenceKOne(a,l,index+1,sum+a[index],target)==true)
            return true;
        l.remove(l.size()-1);
        if(printSubsequenceKOne(a,l,index+1,sum,target) == true)
            return true;
            
        return false;
    }

    public static int printSubsequenceCount(int []a, List<Integer> l, int index, int sum, int target )
    {
        if(index == a.length)
        {
            if(sum == target)
            {
                return 1;
            }
            else
                return 0;
        }
        l.add(a[index]);
        int i = printSubsequenceCount(a,l,index+1,sum+a[index],target);
        l.remove(l.size()-1);
        int j = printSubsequenceCount(a,l,index+1,sum,target);
        return i+j;
    }
    public static void main(String []args)
    {
        int []a = {10,1,2,7,6,1,5};
        Arrays.sort(a);
        List<Integer> l = new ArrayList<>();
        printSubsequenceK(a,l,0,0,8);
    }
}
