public class LinkedListMain {
    public static void main(String []args)
    {
        LL l = new LL();
        l.insertFirst(5);
        l.insertFirst(10);
        l.insertFirst(15);
        l.insertFirst(20);
        l.insertLast(25);
        l.insertAtIndex(12,0);
        l.display();
        System.out.println(l.deleteAtIndex(5));
        l.display();
        l.recuInsert(10,5);
        l.display();
        l.duplicate();
        l.display();
    }
}
