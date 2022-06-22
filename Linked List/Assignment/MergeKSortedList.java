package Assignment;

public class MergeKSortedList {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode l = new ListNode(0,null);
        for(int i = 0; i<lists.length; i++)
        {
            l = merge(l,lists[i]);
        }
        return l.next;
    }

    public ListNode merge(ListNode a, ListNode b)
    {
        if(a == null)return b;
        if(b == null)return a;

        ListNode temp = new ListNode(0,null);
        ListNode i = temp;
        while(a != null && b != null)
        {
            if(a.val < b.val)
            {
                i.next = a;
                i = i.next;
                a = a.next;
            }
            else
            {
                i.next = b;
                i = i.next;
                b = b.next;
            }
        }
        if(a != null)
        {
            i.next = a;
        }
        if(b != null)
            i.next = b;

        return temp.next;
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
        ListNode []l = new ListNode[3];
        l[0] = new ListNode(1,new ListNode(4, new ListNode(5,null)));
        l[1] = new ListNode(1,new ListNode(3, new ListNode(4,null)));
        l[2] = new ListNode(2,new ListNode(6, null));

        MergeKSortedList r = new MergeKSortedList();
        ListNode h = r.mergeKLists(l);
        for(ListNode x : l)
        {
            r.display(x);
        }

        r.display(h);

    }
}
