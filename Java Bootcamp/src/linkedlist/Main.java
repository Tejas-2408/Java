package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(24);

        LL ll1 = new LL();
        ll1.insertFirst(3);
        ll1.insertFirst(4);
        ll1.insertFirst(5);
        ll1.insertFirst(6);
        ll1.insertLast(2);
        ll1.insertLast(1);
        ll1.insert(14,3);
        ll1.display();
        ll1.deleteFirst();
        ll1.display();
        ll1.deleteLast();
        ll1.display();
        ll1.delete(2);
        ll1.display();
    }
}
