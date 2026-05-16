package tree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(10);
//        bst.insert(19);
//        bst.insert(24);
//        bst.insert(8);
//        bst.insert(2);
//        bst.display();

        bst.sortedInsert(new int[]{1,2,3,4,5,6,7,8,9});
//        bst.display();
        bst.preOrder();
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();
    }
}
