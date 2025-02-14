package banktransactionsystem;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Initial balance

        try {
            // Taking user input for withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();

            // Calling withdraw method
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle negative amount
            System.out.println(e.getMessage());
        } finally {
            // Closing scanner
            input.close();
        }
    }
}
