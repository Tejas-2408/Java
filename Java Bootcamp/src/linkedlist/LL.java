package linkedlist;

import javax.print.DocFlavor;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index ; i++){
            temp = temp.next;
        }

        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }

    public void insertRec(int val, int index){
        head = insertion(val,index,head);
    }

    public Node insertion(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertion(val, --index, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        if(head.next == null){
            tail = null;
        }
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size){
            return deleteLast();
        }
        Node node = get(index-1);
        int val = node.next.value;
        node.next = node.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }
}
