package Assignment;

public class SwapNodesInPair {
    public ListNode swapPairs(ListNode head) {

        ListNode f = head;
        ListNode s = head.next;

        while(f.next.next!=null && s.next.next!=null)
        {

        }

        return head;   
    }

    public static void main(String []args)
    {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        SwapNodesInPair s = new SwapNodesInPair();
        s.swapPairs(head);
    }
}
