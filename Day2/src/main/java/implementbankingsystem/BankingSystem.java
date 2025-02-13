package implementbankingsystem;

import java.util.*;

public class BankingSystem {
    //HashMap stores customer accounts
    private HashMap<Integer, Integer> accounts;

    //TreeMap sorts customers by balance.
    private Map<Integer, Integer> balance;

    // Queue processes withdrawal requests.
    private Queue<WithdrawRequest> queue;

    BankingSystem() {
        accounts = new HashMap<>();
        balance = new TreeMap<>();
        queue = new LinkedList<>();

    }

    // Adding bank account
    public void addAccount(Integer accountNumber, Integer balance) {
        accounts.put(accountNumber, balance);
        this.balance.put(balance, accountNumber);
    }

    private class WithdrawRequest {
        Integer accountNumber;
        Integer withdrawAmount;
        WithdrawRequest(Integer accountNumber, Integer withdrawAmount) {
            this.withdrawAmount = withdrawAmount;
            this.accountNumber = accountNumber;
        }
    }
    // request withdraw
    public void requestWithdraw(Integer accountNumber, Integer withdrawAmount) {
        if (accounts.containsKey(accountNumber)) {
            queue.add(new WithdrawRequest(accountNumber, withdrawAmount));
            return;
        }
        System.out.println("Account does not exist");
    }

    // process the request
    public void processRequest() {
        while(!queue.isEmpty()) {
            WithdrawRequest request = queue.poll();
            if (accounts.get(request.accountNumber) < request.withdrawAmount) {
                System.out.println("Insufficient balance");
                return;
            }
            accounts.put(request.accountNumber, accounts.get(request.accountNumber) - request.withdrawAmount);
            System.out.println("Withdraw successful");
        }
    }

    // Method to display all accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        for (Map.Entry<Integer, Integer> entry : balance.entrySet()) {
            System.out.println("Account: " + entry.getValue() + ", Balance: " + entry.getKey());
        }
    }
    public static void main(String[] args) {
        // creating object of banking system
        BankingSystem bankingSystem = new BankingSystem();

        // Adding account
        bankingSystem.addAccount(502578, 1000);
        bankingSystem.addAccount(496540, 1500);
        bankingSystem.addAccount(502598, 2000);
        bankingSystem.addAccount(458956, 3000);
        bankingSystem.addAccount(789898, 4000);

        // Printing the account sorted by balance
        bankingSystem.displayAccountsSortedByBalance();

        // Requesting for withdraw
        bankingSystem.requestWithdraw(789898, 500);

        // this account is not in system
        bankingSystem.requestWithdraw(789546, 500);

        // will not process
        bankingSystem.requestWithdraw(456, 5000);

        bankingSystem.processRequest();
    }
}

