package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Two Numbers to Divide:");
            // Taking input from user
            int n = input.nextInt();
            int m = input.nextInt();

            // Dividing number
            // Printing output
            System.out.println(n/m);

        }
        // Catching Exceptions
        catch (ArithmeticException | InputMismatchException e){
            System.out.println("Invalid Input! "+ e.getMessage());
        }
    }
}
