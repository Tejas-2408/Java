package stackqueues;

import java.util.*;

public class InBuiltClasses {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); this will give error as atack is empty

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        // add and remove from both sides
        // not thread safe
        // faster than stack and LinkedList queue
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(0);
        dq.addLast(5);
        dq.add(10);
        System.out.println(dq.remove());
        System.out.println(dq.remove());
        System.out.println(dq.remove());

    }
}
