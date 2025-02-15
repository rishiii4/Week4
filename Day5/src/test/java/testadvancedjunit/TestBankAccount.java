package testadvancedjunit;

import junit.advancedjunit.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestBankAccount {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance should be updated correctly after deposit.");
    }

    @Test
    void testWithdrawValidAmount() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Balance should be updated correctly after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }

    @Test
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-100));
        assertEquals("Initial balance cannot be negative.", exception.getMessage());
    }
}

