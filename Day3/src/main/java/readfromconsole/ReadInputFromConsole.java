package readfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadInputFromConsole {
    public static void main(String[] args) {
        // File path
        String file = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\readfromconsole\\file.txt";

        try {
            // BufferedReader to read input from the console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // FileWriter to write data into the file
            FileWriter fw = new FileWriter(file);

            System.out.println("Enter your Name:");
            fw.write(br.readLine() + "\n");

            System.out.println("Enter your Age:");
            fw.write(br.readLine() + "\n");

            System.out.println("Enter your Favourite Programming Language:");
            fw.write(br.readLine() + "\n");

            // Close streams
            br.close();
            fw.close();
        }
        catch (IOException e) {
            // Handle IO exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}

