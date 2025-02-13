package queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        // Queue declaration
        Queue<Integer> queue = new ArrayDeque<>();

        // Adding elements in queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Stack declaration to reverse queue
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            // Pushing elements in stack
            stack.push(queue.remove());
        }
        System.out.println(stack);

        while (!stack.isEmpty()){
            // Adding elements back in queue
            int top=stack.pop();
            queue.add(top);
        }

        // Printing output
        System.out.println(queue);
    }
}
