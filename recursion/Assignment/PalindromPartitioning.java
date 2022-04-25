package Assignment;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartitioning {
    public static List<List<String>> partition(String s) {

        List<List<String>> str = new ArrayList<>();
        
        func(0, s,str,new ArrayList<>());

        return str;
    }

    static void func(int ind, String s, List<List<String>> l, List<String> ds)
    {
        if(ind == s.length())
        {
            l.add(new ArrayList<>(ds));
            return;
        }        

        for(int i = ind; i<s.length(); i++)
        {
            if(isPalindrom(s,ind,i))
            {
                ds.add(s.substring(ind,i+1));
                func(i + 1, s, l, ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    static boolean isPalindrom(String str, int s, int e)
    {
        while(s <= e)
        {
            if(str.charAt(s++) != str.charAt(e--))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args)
    {

        String s = "aabb";
        System.out.println(partition(s));
      }
}
