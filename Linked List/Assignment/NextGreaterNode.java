package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/next-greater-node-in-linked-list/

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();

        ListNode f = head;
        
        
        while(f != null)
        {
            ListNode s = f.next;
            boolean flag = false;
            while(s != null)
            {
                flag = false;
                if(f.val < s.val)
                {
                    l.add(s.val);
                    break;
                }
                s = s.next;
                flag = true;
            }
            if(flag)
                l.add(0);
            f = f.next;
        }
        l.add(0);
        int []arr = new int[l.size()];

        for(int i = 0; i<l.size(); i++)
        {
            arr[i] = l.get(i);
        }
        return arr;
    }
    public static void main(String []args)
    {
        ListNode l = new ListNode(2,new ListNode(1,new ListNode(5,null)));
        NextGreaterNode n = new NextGreaterNode();
        System.out.println(Arrays.toString(n.nextLargerNodes(l)));
    }
}
