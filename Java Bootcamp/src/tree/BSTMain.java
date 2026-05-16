package tree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(19);
        bst.insert(24);
        bst.insert(8);
        bst.insert(2);
        bst.display();
    }
}
