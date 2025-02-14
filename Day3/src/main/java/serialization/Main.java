package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Rohit", "IT"));
        employees.add(new Employee(201, "Shyam", "HR"));

        // File path to store serialized data
        String filePath = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day3\\src\\main\\java\\serialization\\file.txt";

        // Serializing the list of employees
        serialization(filePath, employees);

        // Deserializing the list of employees and displaying them
        deSerialization(filePath);
    }

    //Serializes a list of Employee objects and saves them to a file.
    public static void serialization(String filePath, List<Employee> employees) {
        System.out.println("Serialization start...");
        try (
                // Creating file output stream and object output stream
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            // Writing the entire list to the file
            objectOutputStream.writeObject(employees);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
        System.out.println("Serialization end...");
    }

    //    Deserializes a list of Employee objects from a file and displays them.
    public static void deSerialization(String filePath) {
        System.out.println("Deserialization start...");
        try (
                // Creating file input stream and object input stream
                FileInputStream fileInputStream = new FileInputStream(filePath);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            // Read object from file
            Object obj = objectInputStream.readObject(); // Read object

            // Ensure the object is a List before casting
            if (obj instanceof List<?>) {
                List<?> tempList = (List<?>) obj; // Cast to raw List
                List<Employee> employees = new ArrayList<>();

                for (Object item : tempList) {
                    if (item instanceof Employee) {
                        System.out.println(item); // Calls Employee.toString()
                    } else {
                        System.err.println("Unexpected object type in list: " + item.getClass().getName());
                    }
                }
            }
        }catch(IOException e){
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        System.out.println("Deserialization end...");
    }
}
