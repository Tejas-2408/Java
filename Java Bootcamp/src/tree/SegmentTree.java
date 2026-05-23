package tree;

// SegmentTree (ST) is a binary Tree which has the interval information and operation performing

public class SegmentTree {

    private static class Node{
        int data;
        int startRange;
        int endRange;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, int startRange, int endRange) {
            this.data = data;
            this.startRange = startRange;
            this.endRange = endRange;
        }

        public Node(int startRange, int endRange) {
            this.startRange = startRange;
            this.endRange = endRange;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        // create tree using the array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start+end)/2;

        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(root);
    }

    private void display(Node node) {
        String str = "";
        if(node.left != null){
            str = str + "Interval = [" + node.left.startRange + "-" + node.left.endRange + "] and data: " + node.left.data + " =>";
        }

        else{
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval = [" + node.startRange + "-" + node.endRange + "] and data: " + node.data + " <=";

        if(node.right != null){
            str = str + "Interval = [" + node.right.startRange + "-" + node.right.endRange + "] and data: " + node.right.data ;
        }

        else{
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recusion
        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }

    }

    // query
    public int query(int qsi, int qei){
        return query(root,qsi,qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.startRange >= qsi && node.endRange <= qei){
            // node is completely lying inside range
            return node.data;
        }

        else if (node.startRange > qei || node.endRange < qsi){
            // completey outside
            return 0;
        }

        else{
            return query(node.left,qsi,qei) + query(node.right,qsi,qei);
        }
    }

    // update a index
    public void update(int index, int value){
        update(root,index,value);
    }

    private int update(Node node, int index, int value) {
        if(index >= node.startRange && index <= node.endRange){
            if(index == node.startRange && index == node.endRange){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.data= leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }

}
