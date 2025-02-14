package multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array of numbers
        int arr[] = {12,20,25,30,40};

        try {
            System.out.println("Enter the index to retrieve value: ");
            // User input for index
            int idx = input.nextInt();

            // Access the value at the given index
            System.out.println("Value at index "+idx +" is "+arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles out-of-bounds access
            System.out.println("Invalid Index! "+e.getMessage());
        } catch (NullPointerException e){
            // Handles null array access
            System.out.println("Array is not initialized! "+e.getMessage());
        }

        input.close();
    }
}
