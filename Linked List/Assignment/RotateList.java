package Assignment;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode s = head;
        // int size = 0;
        // while(s.next != null)
        // {
        //     size++;
        //     s = s.next;
        // }
        
        int i = 0;
        // k = k % size;
        ListNode t = head;
        while(i < k && t.next != null)
        {
            t = t.next;
            i++;
        }
        ListNode nthNode = t;
        
        while(t.next != null)
        {
            t = t.next;
        }
        
        t.next = head;
        head = nthNode.next;
        nthNode.next = null;
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
        ListNode h = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5, null)))));
        RotateList r = new RotateList();
        r.display(h);
        r.rotateRight(h, 2);
        r.display(h);
    }
}
