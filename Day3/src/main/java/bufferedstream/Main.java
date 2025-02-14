package bufferedstream;

public class Main {
    public static void main(String[] args) {
        // File paths
        String file = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\bufferedstream\\file.txt";
        String newFile1 = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\bufferedstream\\newFile1.txt";
        String newFile2 = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\bufferedstream\\newFile2.txt";

        System.out.println("Time taken by Buffer:");
        // Calling timeTakenByBuffer
        long timeByBuffer = EfficientFileCopy.timeTakenByBuffer(file, newFile1);
        System.out.println(timeByBuffer+" ms");

        System.out.println("Time taken by Normal File Stream:");
        // Calling timeTakenByFileInput
        long timeByNormal = EfficientFileCopy.timeTakenByFileInput(file, newFile2);
        System.out.println(timeByNormal+" ms");
    }
}
