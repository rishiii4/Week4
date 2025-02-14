package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteTextFile {
    public static void main(String[] args) {
        String file = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\filehandling\\file.txt";
        String newFile = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\filehandling\\newFile.txt";
        try {
            // Creating FileInputStream
            FileInputStream fis = new FileInputStream(file);
            // Creating FileOutputStream
            FileOutputStream fos = new FileOutputStream(newFile);

            // Reading data from file
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            // Closing the stream
            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
