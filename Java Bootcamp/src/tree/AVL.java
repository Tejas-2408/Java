package tree;

public class AVL {
    private class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public AVL(){

    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public int getHeight(){
        return getHeight(root);
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left child of "+ node.getValue() + " : ");
        display(node.right, "Right child of "+ node.getValue() + " : ");
    }

    public void sortedInsert(int[] value){
        sortedInsert(value, 0, value.length);
    }

    public void sortedInsert(int value[], int s, int e){
        if(s >= e){
            return;
        }

        int m = s + (e-s)/2;
        insert(value[m]);
        sortedInsert(value,s,m);
        sortedInsert(value,m+1,e);
    }

    public void insert(int value){
        root = insert(value,root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.getValue()){
            node.left = insert(value,node.left);
        }

        if(value > node.getValue()){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(getHeight(node.left) - getHeight(node.right) > 1){
            // left heavy
            if(getHeight(node.left.left) - getHeight(node.left.right) > 0){
                // left-left case
                return rightRotate(node);
            }

            if(getHeight(node.left.left) - getHeight(node.left.right) < 0){
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getHeight(node.left) - getHeight(node.right) < -1){
            // right heavy
            if(getHeight(node.right.left) - getHeight(node.right.right) < 0){
                // right-right case
                return leftRotate(node);
            }

            if(getHeight(node.right.left) - getHeight(node.right.right) > 0){
                // right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;

    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(getHeight(p.left),getHeight(p.right)+1);
        c.height = Math.max(getHeight(c.left),getHeight(c.right)+1);

        return p;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(getHeight(p.left),getHeight(p.right)+1);
        c.height = Math.max(getHeight(c.left),getHeight(c.right)+1);

        return c;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
