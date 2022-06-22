// package Assignment;

// import java.util.ArrayList;
// import java.util.Collections;

// class Node {
//     int data;
//     Node next;
//     Node bottom;

//     Node(int d) {
//         data = d;
//         next = null;
//         bottom = null;
//     }
// }

// public class FlattenLinkedList {
//     Node flatten(Node root) {
//         ArrayList<Integer> a = new ArrayList<>();
//         Node h = root;

//         while(h != null)
//         {
//             a.add(h.data);
//             Node b = h.bottom;
//             while(b != null)
//             {
//                 a.add(b.data);
//                 b = b.bottom;
//             }
//             h = h.next;
//         }
//         Collections.sort(a);
//         Node head = new Node(0);
//         Node t = head;
//         for(int i = 0; i<a.size();i++)
//         {
//             Node p = new Node(a.get(i));
//             t.next = p;
//             t = t.next;
//         }
//         return head.next;
//     }
//     public void display(Node h)
//     {
//         Node t = h;
//         while(t != null)
//         {
//             System.out.print(t.data+"-->");
//             t = t.next;
//         }
//         System.out.println("END");
//     }

//     public static void main(String[] args) {
//         Node n = new Node(5);
//         n.bottom = new Node(7);
//         n.bottom.bottom = new Node(8);
//         n.bottom.bottom.bottom = new Node(30);
//         n.next = new Node(10);
//         n.next.bottom = new Node(20);
//         n.next.next = new Node(19);
//         n.next.next.bottom = new Node(22);
//         n.next.next.bottom.bottom = new Node(50);
//         n.next.next.next = new Node(28);
//         n.next.next.next.bottom = new Node(35);
//         n.next.next.next.bottom.bottom = new Node(40);
//         n.next.next.next.bottom.bottom.bottom = new Node(45);

//         FlattenLinkedList f = new FlattenLinkedList();
//         Node t = f.flatten(n);
//         f.display(t);
//     }
// }
