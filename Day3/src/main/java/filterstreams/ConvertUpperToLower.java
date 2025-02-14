package filterstreams;

import java.io.*;

public class ConvertUpperToLower {

    public static void convertToLowercase(String inputFile, String outputFile) {
        try (
                // BufferedReader and BufferedWriter
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\filterstreams\\file.txt";   // Input file (must exist)
        String outputFile = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\filterstreams\\newFile1.txt"; // Output file

        // Convert uppercase to lowercase and write to output file
        convertToLowercase(inputFile, outputFile);
    }
}
