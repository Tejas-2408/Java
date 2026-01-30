package stackqueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue();
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.display();

        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.display();
        System.out.println(cq.front());

    }
}
