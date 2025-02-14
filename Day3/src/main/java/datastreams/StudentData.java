package datastreams;

import java.io.*;

public class StudentData {

    public static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Rishi");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Roshi");
            dos.writeDouble(3.6);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readStudentData(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) { // Read till end of file
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Student: Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            // Catch IOException
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        // File path
        String fileName = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\datastreams\\data.bin"; // Binary file

        // Writing student data to the file
        writeStudentData(fileName);

        // Reading student data from the file
        readStudentData(fileName);
    }
}

