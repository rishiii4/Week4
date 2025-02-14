package finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");
        // Taking input of numbers from user
        int n = input.nextInt();
        int m = input.nextInt();
        try {
            // Performing division
            System.out.println(n/m);
        } catch (ArithmeticException e) {
            // Catching ArithmeticException
            System.out.println("Invalid Input! "+e.getMessage());
        }finally {
            // Finally block
            System.out.println("Operation Completed!");
        }
    }
}
