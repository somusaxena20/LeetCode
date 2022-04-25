package Assignment;

public class DeleteNthNode {
    Node head;
    
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

    public void removeNthFromEnd(int n) {
        int size = 0;
        
        Node t = head;
        while(t != null)
        {
            size+=1;
            t = t.next;
        }

        if(n == 1)
        {
            t = head;
            while(t.next.next != null)
            {
                t = t.next;
            }
            t.next = null;
        }
        else
        {
            int p = 0;
            t = head;
            while(p != size - n)
            {
                p++;
                t = t.next;
            }
            t.val = t.next.val;
            t.next = t.next.next;
        }
    }
    public static void main(String []args)
    {
        DeleteNthNode r = new DeleteNthNode();
        r.insert(5);
        r.insert(10);
        r.insert(15);
        r.insert(20);
        r.insert(25);
        r.display();
        r.removeNthFromEnd(1);
        r.display();

    }
}
