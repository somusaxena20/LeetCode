package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Combination
{

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        backTrack(n,k,1,l,new ArrayList<>());
        return l;
    }
    
    private void backTrack(int n, int k, int dep, List<List<Integer>> ans, List<Integer> temp) {
        if (temp.size() == k) {
            ans.add(new ArrayList(temp));
            return;
        }
        for (int i = dep; i <= n - k + 1 + temp.size(); i++) {
            temp.add(i);
            backTrack(n, k, i + 1, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String []args)
    {
        System.out.println(new Combination().combine(4,2));
    }
}