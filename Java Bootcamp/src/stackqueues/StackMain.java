package stackqueues;

import java.util.Objects;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack cs = new CustomStack(5);

        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
//        cs.push(6);

//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop());
//        System.out.println(cs.pop()); this will throw custom error

        DynamicCustomStack ds = new DynamicCustomStack(5);
        ds.push(6);
        ds.push(7);
        ds.push(8);
        ds.push(9);
        ds.push(10);
        ds.push(11);
        ds.push(12);

//        System.out.println(ds.pop());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());
//        System.out.println(ds.pop());

        CustomStack ds1 = new DynamicCustomStack(5);
        ds1.push(6);
        ds1.push(7);
        ds1.push(8);
        ds1.push(9);
        ds1.push(10);
        ds1.push(11);
        ds1.push(12);

        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
        System.out.println(ds1.pop());
    }
}
