package nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Taking user input for index and divisor
            System.out.print("Enter an index: ");
            int index = input.nextInt();

            try {
                // Trying to access the array element at the given index
                int value = numbers[index];

                System.out.print("Enter a divisor: ");
                int divisor = input.nextInt();

                try {
                    // Trying to perform division
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    // Handling division by zero
                    System.out.println("Cannot divide by zero!" + e.getMessage());
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling invalid index access
                System.out.println("Invalid array index!" + e.getMessage());
            }

        } finally {
            // Closing scanner
            input.close();
        }
    }
}

