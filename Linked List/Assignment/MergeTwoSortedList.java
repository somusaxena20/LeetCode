package Assignment;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode();
        ListNode t = start;
        while( list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                t.next = list1;
                list1 = list1.next;
                t = t.next;
            }
            else
            {
                t.next = list2;
                list2 = list2.next;
                t = t.next;
            }
        }
        if(list1 != null)
            t.next = list1;
        
        if(list2 != null)
            t.next = list2;
        return start.next;
    }
    public static void display()
    {
        
    }

    public static void main(String []args)
    {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
        mergeTwoLists(l1,l2);

    }
}
