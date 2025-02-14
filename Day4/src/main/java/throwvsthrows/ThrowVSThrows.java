package throwvsthrows;

import java.util.Scanner;

public class ThrowVSThrows {
    // Method to calculate interest with exception handling
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        // Amount and rate should be positive
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Invalid Input!: Amount and Rate must be Greater than Zero!");
        }
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input of amount, rate and years from user
        double amount = input.nextDouble();
        double rate = input.nextDouble();
        int years = input.nextInt();

        try {
            System.out.println("Enter Amount, Rate and Years: ");
            // Calling calculateInterest method
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);


            double invalidInterest = calculateInterest(-500, 5, 3);
            System.out.println("Invalid Interest: " + invalidInterest);

        } catch (IllegalArgumentException e) {
            // Handle the exception and display an error message
            System.out.println(e.getMessage());
        }
    }
}
