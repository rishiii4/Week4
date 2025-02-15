package junit.advancedjunit;

public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    // Get Balance
    public double getBalance() {
        return balance;
    }
}

