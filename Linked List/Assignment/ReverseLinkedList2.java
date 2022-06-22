package Assignment;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)return head;
        
        int i = 1;
        
        ListNode s,e,s1,e1,t;
        s = e = null;
        t = s1 = e1 = head;
        
        while(t != null)
        {
            if(i < left)
            {
                s = s1;
                s1 = s1.next;
            }
            if(i <= right)
            {
                e = e1;
                e1 = e1.next;
            }
            t = t.next;
            i++;
        }
        e.next = null;
        ListNode rev = reverseList(s1);
        s.next = rev;
        
        while(rev.next != null)
            rev = rev.next;
        
        rev.next = e1;
        
        return head;
    }
    public ListNode reverseList(ListNode head) {
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
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        ReverseLinkedList2 r = new ReverseLinkedList2();
        r.reverseBetween(head, 2, 4);
        r.display(head);
    }
}
