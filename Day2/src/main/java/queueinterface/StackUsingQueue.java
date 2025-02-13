package queueinterface;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingOneQueue {
    Queue<Integer> queue = new LinkedList<>();

    // Push operation (Costly)
    public void push(int data) {
        int size = queue.size();
        queue.add(data);

        // Rotate the queue so that new element moves to front
        for (int i = 0; i < size; i++) {
            queue.add(queue.poll());
        }
    }

    // Pop operation (Fast)
    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return queue.poll(); // Directly remove top element
    }

    // Peek operation
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return queue.peek();
    }

    // Check if empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        StackUsingOneQueue stack = new StackUsingOneQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
    }
}

