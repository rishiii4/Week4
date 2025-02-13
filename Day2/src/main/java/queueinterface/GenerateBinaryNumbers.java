package queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateBinaryNumbers {
    // Method to generate binary
    public static <T> void generateBinary(Queue<Integer> queue){
        Queue<String> binary = new ArrayDeque<>();

        for(Integer ele: queue){
            binary.add(Integer.toBinaryString(ele));
        }

        System.out.println(binary);
    }
    public static void main(String[] args) {
        // Queue declaration
        Queue<Integer> queue = new ArrayDeque<>();

        // Adding elements to queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Calling generateBinary method
        generateBinary(queue);

    }
}
