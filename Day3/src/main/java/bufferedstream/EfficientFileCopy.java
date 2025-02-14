package bufferedstream;

import java.io.*;

public class EfficientFileCopy {
    public static long timeTakenByBuffer(String file, String newFile1){
        // Start time of buffered input stream
        long starTime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(newFile1);
            BufferedOutputStream bos = new BufferedOutputStream(fos);)
        {
            int byteData ;
            while((byteData = fis.read()) != -1){
                bos.write(byteData);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        // Return total time taken
        return System.nanoTime() - starTime;
    }

    public static long timeTakenByFileInput(String file,String newFile2){
        // Start time of normal input stream
        long startTime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(newFile2);) {
            int data;
            while ((data = fis.read()) != -1){
                fos.write(data);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        // Return total time taken
        return System.nanoTime() - startTime;
    }
}
