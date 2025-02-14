package pipedstream;

import java.io.*;

public class InterThreadCommunication {
    public static void main(String[] args) throws IOException {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream(outputStream); // Connect streams

        // Writer thread
        Thread writerThread = new Thread(() -> {
            try {
                String message = "This is a message from the writer thread.";
                byte[] data = message.getBytes();
                outputStream.write(data);
                System.out.println("Writer thread: Message written.");
                outputStream.close(); // Important: Close the output stream when done
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        });

        // Reader thread
        Thread readerThread = new Thread(() -> {
            try {
                int data;
                StringBuilder receivedMessage = new StringBuilder();
                while ((data = inputStream.read()) != -1) {
                    receivedMessage.append((char) data);
                }
                System.out.println("Reader thread: Message received: " + receivedMessage.toString());
                inputStream.close(); // Close the input stream
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        });

        writerThread.start();
        readerThread.start();

        try {
            // Wait for writer to finish
            writerThread.join();
            // Wait for reader to finish
            readerThread.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
