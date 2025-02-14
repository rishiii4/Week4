package readlargefile;

import java.io.*;

public class ReadFile {

    private static void readLargeFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            // Catch FileNotFoundException
            System.err.println(e.getMessage());
        } catch (IOException e) {
            // Catch IOException
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Path to the large file
        String filePath = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\readlargefile\\LargeFile.txt";

        readLargeFile(filePath);
    }
}
