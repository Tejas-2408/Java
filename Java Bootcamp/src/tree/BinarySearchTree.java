package tree;

import java.util.Scanner;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
    }

    private static class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value, int height, Node left, Node right) {
            this.value = value;
            this.height = height;
            this.left = left;
            this.right = right;
        }

        public int getValue(){
            return value;
        }
    }

    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
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

        return node;
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
