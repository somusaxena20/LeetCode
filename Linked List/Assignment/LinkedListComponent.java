package Assignment;

import java.util.ArrayList;
import java.util.List;

public class LinkedListComponent {
    public int numComponents(ListNode head, int[] nums) {
        ListNode t = head;
        List<Integer> l = new ArrayList<>();

        for( int x:nums)
            l.add(x);
        int c = 0;
        int s = 0;
        while(t != null)
        {
            while(t != null && l.contains(t.val))
            {
                c = 1;
                t = t.next;
            }
            if(t != null)
                t = t.next;
            s += c;
        }
        return s;
    }

    public static void main(String []args)
    {
        ListNode h = new ListNode(3,new ListNode(4,new ListNode(0,new ListNode(2,new ListNode(1,null)))));
        int []a = {4};
        LinkedListComponent l = new LinkedListComponent();
        System.out.println(l.numComponents(h, a));
    }
}
