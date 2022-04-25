import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {

    public static void printSubsequence(int []a, List<Integer> l, int index)
    {
        if(index == a.length)
        {
            System.out.println(l);
            return;
        }
        
        l.add(a[index]);
        printSubsequence(a,l,index+1);
        l.remove(l.size()-1);
        printSubsequence(a,l,index+1);
        
        
    }
    public static void main(String []args)
    {
        int []a = {3,1,2};
        List<Integer> l = new ArrayList<>();
        printSubsequence(a,l,0);
    }
}
