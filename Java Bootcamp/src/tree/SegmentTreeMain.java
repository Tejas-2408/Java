package tree;

public class SegmentTreeMain {
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree st = new SegmentTree(arr);
        st.display();
        System.out.println(st.query(2,6));
        st.update(3,14);
        System.out.println(st.query(2,6));
    }
}
