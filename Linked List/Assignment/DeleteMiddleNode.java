package Assignment;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next == null)return null;
        
        int len = 0;
        
        ListNode t = head;
        
        while(t != null)
        {
            len++;
            t = t.next;
        }
        t = head;
        int ind = len/2;
        
        while(ind-- > 1)
        {
            t = t.next;
        }
        
        t.next = t.next.next;
        
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
        ListNode h = new ListNode(2,new ListNode(1,null));
        DeleteMiddleNode d = new DeleteMiddleNode();
        d.display(h);
        d.deleteMiddle(h);
        d.display(h);
    }
}
