package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum
{

    void findSub(int i, ArrayList<Integer> a, int sum, ArrayList<Integer> l)
    {
        if(i == a.size())
        {
            l.add(sum);
            return;
        }

        findSub(i+1,a,sum+a.get(i),l);
        findSub(i+1,a,sum,l);
    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        findSub(0,arr,0,l);
        return l;
    }
    public static void main(String []args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ArrayList<Integer> l1 = new SubsetSum().subsetSums(arr,arr.size());
        Collections.sort(l1);
        System.out.println(l1);
    }
}