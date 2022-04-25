package Assignment;

public class DeleteNodeOfVal {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)return head;
        ListNode start = new ListNode();
        start.next = head;
        
        ListNode p = start;
        ListNode h = start.next;

        while(h != null)
        {
            if(h.val == val)
            {
                p.next = h.next;
                h = h.next;
            }
            else
            {
                p = p.next;
                h = h.next;
            }
        }

        h = head;

        if(h.val == val)
            return head.next;

        return start.next;
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
        ListNode l = new ListNode(6,new ListNode(2,new ListNode(6, new ListNode(3, new ListNode(4,new ListNode(5,new ListNode(6,null)))))));
        DeleteNodeOfVal d = new DeleteNodeOfVal();

        d.removeElements(l, 6);
        d.display(l);
    }
}
