package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static void main(String[] args) {
        // File path
        String file = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day4\\src\\main\\java\\trywithresources\\file.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            // Read the first line from the file
            String firstLine = br.readLine();
            // Check if the file has content
            if (firstLine != null) {
                System.out.println("First Line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        }
        catch (IOException e){
            // Handle exception if file is not found
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
