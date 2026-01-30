package stackqueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue();
//        cq.insert(1);
//        cq.insert(2);
//        cq.insert(3);
//        cq.insert(4);
//        cq.insert(5);
//        cq.display();
//
//        System.out.println(cq.remove());
//        System.out.println(cq.remove());
//        System.out.println(cq.remove());
//        cq.display();
//        System.out.println(cq.front());

        CircularQueue cq1 = new CircularQueue();
        cq1.insert(1);
        cq1.insert(2);
        cq1.insert(3);
        cq1.insert(4);
        cq1.insert(5);
        cq1.insert(6);
        cq1.display();
        System.out.println(cq1.remove());
        System.out.println(cq1.remove());
        System.out.println(cq1.remove());
        cq1.display();
        System.out.println(cq1.front());
        cq1.insert(7);
        cq1.insert(8);
        cq1.insert(9);
        cq1.insert(10);
        cq1.insert(11);
        cq1.insert(12);
        cq1.display();

    }
}
