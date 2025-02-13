package queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class CircularBufferSimulation {
    // Printing the queue
    public static <T> void print(Queue<T> queue) {
        for(T element : queue) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // Method for adding in queue as circular queue
    public static <T> void addOperation(Queue<T> queue, T element, int size) {
        // If queue size equal to size of given circular queue, then pop from front
        if(queue.size() == size) {
            queue.remove();
        }

        // Add element at the back
        queue.add(element);
    }
    public static void main(String[] args) {
        // Queue declaration
        Queue<Integer> queue = new ArrayDeque<>();
        // Defining the size
        int size = 3;

        // Performing the add operation
        addOperation(queue, 4, size);
        addOperation(queue, 5, size);
        addOperation(queue, 6, size);
        // Printing the queue elements before exceeding the size
        print(queue);

        // Adding element beyond declared the size
        addOperation(queue, 7, size);
        // Printing the queue
        print(queue);
    }
}

