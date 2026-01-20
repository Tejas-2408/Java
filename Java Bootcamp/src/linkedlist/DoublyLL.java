package linkedlist;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }



    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
