package checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        // File path
        String file = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day4\\src\\main\\java\\checkedexception\\file.txt";
        // FileReader and BufferedReader to read file content
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            // Reading and printing file content
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        // Catching IOException
        catch (IOException e){
            System.out.println("File not Found! " + e.getMessage());
        }
    }
}
