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
//        cq1.insert(1);
//        cq1.insert(2);
//        cq1.insert(3);
//        cq1.insert(4);
//        cq1.insert(5);
//        cq1.insert(6);
//        cq1.display();
//        System.out.println(cq1.remove());
//        System.out.println(cq1.remove());
//        System.out.println(cq1.remove());
//        cq1.display();
//        System.out.println(cq1.front());
//        cq1.insert(7);
//        cq1.insert(8);
//        cq1.insert(9);
//        cq1.insert(10);
//        cq1.insert(11);
//        cq1.insert(12);
//        cq1.display();

        DynamicQueue dq = new DynamicQueue();
        dq.insert(1);
        dq.insert(2);
        dq.insert(3);
        dq.insert(4);
        dq.insert(5);
        dq.insert(6);
        dq.insert(7);
        dq.insert(8);
        dq.display();
        dq.insert(9);
        dq.insert(10);
        dq.insert(11);
        dq.insert(12);
        dq.insert(13);
        dq.display();
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        dq.display();
        System.out.println(dq.front());


    }
}
