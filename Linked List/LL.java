class LL
{
    private Node head;
    private Node tail;
    private int size;

    LL()
    {
        size = 0;
    }
    public void duplicate()
    {
        Node n = head;

        int prev = -1;
        while(n != null)
        {
            if(prev == n.val)
            {
                n.val = n.next.val;
                n.next = n.next.next;
            }
            else
            {
                prev = n.val;
            }
        }


    }
    public void insertIndexRec(Node n, int v, int ind)
    {
        if(ind == 1)
        {
            Node t = new Node(v);
            t.next = n.next;
            n.next = t;
            return;
        }
        if(n.next != null)
            insertIndexRec(n.next,v,ind-1);
        else
            return;
    }

    public void recuInsert(int v, int ind)
    {
        insertIndexRec(head,v,ind);
    }

    public void insertFirst(int val)
    {   
        Node n = new Node(val);
        if(head == null)
        {
            head = n;
            tail = head;
            size +=1;
        }
        else
        {
            n.next = head;
            head = n;
            size += 1;
        }
    }

    public void insertLast(int val)
    {   
        Node n = new Node(val);
        if(tail == null)
        {
            head = n;
            tail = head;
            size +=1;
        }
        else
        {
            tail.next = n;
            tail = n;
            size += 1;
        }
    }

    public void insertAtIndex(int v, int ind)
    {
        if(ind <= size)
        {
            if(ind == 0)
            {
                insertFirst(v);
                return;
            }
            if(ind == size)
            {
                insertLast(v);
                return;
            }
            Node t = head;
            for(int i = 1; i<ind; i++)
            {
                t = t.next;
            }

            Node n = new Node(v,t.next);
            t.next = n;
            size +=1;
        }
    }

    public int deleteFirst()
    {
        if(head == null)
            return -1;
        int s = head.val;
        head = head.next;
        return s;
    }

    public int deleteLast()
    {
        Node n = head;

        while(n.next.next != null)
        {
            n = n.next;
        }
        int v = n.next.val;
        n.next = null;
        return v;
    }

    public int deleteAtIndex(int ind)
    {
        if(ind > size-1)
        {
            return -1;
        }
        Node t = head;
        while(ind > 1)
        {
            t = t.next;
            ind--;
        }

        int v = t.next.val;
        t.next = t.next.next;
        return v;
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
    class Node
    {
        private int val;
        private Node next;

        Node(int v)
        {
            this.val = v;
        }

        Node(int v, Node n)
        {
            this.val = v;
            this.next = n;
        }
    }
}