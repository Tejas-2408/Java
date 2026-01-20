package linkedlist;

public class CircularLL {

    private Node head;
    private Node tail;

    public void insertBeforeHead(int val){
        Node node = new Node(val);
        if(head != null){
            node.next = head;
        }
        head = node;
        if(tail == null){
            tail = node;
        }
        else{
            tail.next = node;
        }

    }

    public void insertAfterTail(int val){
        if(head == null){
            insertBeforeHead(val);
            return;
        }

        Node node = new Node(val);
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.value + "->");
                temp = temp.next;
            }while (temp != head);
        }
    }

    public void delete(int val){
        Node node = head;
        while(node.next.value != val){
            node = node.next;
        }

        node.next = node.next.next;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
