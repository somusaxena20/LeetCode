package Assignment;

import java.util.HashMap;
import java.util.Map;

class Node
{
    int key,val;
    Node next;
    Node prev;

    Node(int k, int v)
    {
        this.key = k;
        this.val = v;
    }
}

public class LRU
{
    private int capacity;
    Map<Integer,Node> m = new HashMap<>();
    Node h = new Node(0,0),t = new Node(0,0); 
    public LRU(int capacity) {
        this.capacity = capacity;
        h.next = t;
        t.prev = h;
    }
    
    public int get(int key) {
        if(m.containsKey(key))
        {
            Node n = m.get(key);
            remove(n);
            insert(n);
            return n.val;
        }else
         return -1;
    }

    public void put(int key, int value) {
        if(m.containsKey(key))
        {
            remove(m.get(key));
        }

        if(m.size() == capacity)
        {
            remove(t.prev);
           
        }
        insert(new Node(key,value));
    }
    
    private void insert(Node n) {
        m.put(n.key,n);
        n.next = h.next;
        n.next.prev = n;
        n.prev = h;
        h.next = n;
    }

    private void remove(Node n) {
        m.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev; 
    }

    
}