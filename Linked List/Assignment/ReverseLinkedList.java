package Assignment;

class Node
{
    int val;
    Node next;

    
}
public class ReverseLinkedList {
    Node head;
    public void reverse()
    {
        Node n = null;
        Node h = head;

        while(h != null)
        {
            Node p = h.next;
        
            h.next = n;
            n = h;
            h = p;
        }
        head = n;
    }
    public void insert(int v)
    {
        Node n = new Node();
        n.val = v;
        if(head == null)
        {
            head = n;
        }
        else
        {
            Node t = head;
            while(t.next != null)
            {
                t = t.next;
            }
            t.next = n;
        }
    }

    public void display()
    {
        Node t = head;

        while(t != null)
        {
            System.out.print(t.val+"-->");
            t = t.next;
        }
        System.out.println("END");
    }
    public static void main(String []args)
    {
       
        ReverseLinkedList r = new ReverseLinkedList();
        r.insert(5);
        r.insert(10);
        r.insert(15);
        r.insert(20);
        r.insert(25);
        r.display();
        r.reverse();
        r.display();
    }
}
