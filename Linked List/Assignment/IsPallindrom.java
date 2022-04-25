package Assignment;

public class IsPallindrom {
    public boolean isPalindrome(ListNode head) {
        ListNode h = head;
        ListNode r = reverse(head);
        
        while(h != null && r != null)
        {
            if(h.val != r.val)
                return false;
            h = h.next;
            r = r.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode n = null;
        ListNode h = head;

        while(h != null)
        {
            ListNode p = h.next;
        
            h.next = n;
            n = h;
            h = p;
        }
        return n;
    }

    public void display(ListNode head)
    {
        ListNode t = head;

        while(t != null)
        {
            System.out.print(t.val+"-->");
            t = t.next;
        }
        System.out.println("END");
    }

    public static void main(String []args)
    {
        ListNode h = null;
        IsPallindrom p = new IsPallindrom();
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(1,null))));

        ListNode r = p.reverse(head);
        p.display(head);
        p.display(r);
    }
}

