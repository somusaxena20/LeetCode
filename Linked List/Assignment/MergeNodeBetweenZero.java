package Assignment;

// https://leetcode.com/problems/merge-nodes-in-between-zeros/
public class MergeNodeBetweenZero {
    public ListNode mergeNodes(ListNode head) {
        ListNode s = head.next;
        int sum = 0;
        ListNode n = new ListNode(0,null);
        ListNode p = n;
        while(s != null)
        {
            if(s.val == 0)
            {
                p.next = new ListNode(sum,null);
                p = p.next;
                sum = 0;
            }
            else
            {
                sum += s.val;
            }
            s = s.next;
        }
        return n.next;
    }

    public void display(ListNode h)
    {
        ListNode t = h;
        while(t != null)
        {
            System.out.print(t.val+"-->");
            t = t.next;
        }
        System.out.println("END");
    }
    public static void main(String []args)
    {
        // [0,3,1,0,4,5,2,0]
        ListNode h = new ListNode(0,new ListNode(3,new ListNode(1,new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0,null))))))));
        MergeNodeBetweenZero r = new MergeNodeBetweenZero();
        r.display(h);
        ListNode h1 = r.mergeNodes(h);
        r.display(h1);
    }
}
