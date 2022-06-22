package Assignment;

// https://leetcode.com/problems/insertion-sort-list/submissions/

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode s = head.next;
        ListNode e = head;

        while(s != null)
        {
            while(e != s)
            {
                if(e.val > s.val)
                {
                    int t = e.val;
                    e.val = s.val;
                    s.val = t;
                    e = e.next;
                }
                else
                {
                    e = e.next;
                }
            }
            s = s.next;
            e = head;
        }
        return head;
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
        ListNode h = new ListNode(5,new ListNode(4,new ListNode(3,new ListNode(2, new ListNode(1, null)))));
        InsertionSortList r = new InsertionSortList();
        r.display(h);
        r.insertionSortList(h);
        r.display(h);

        
    }
}
