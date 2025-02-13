package policymanagement;

public class PolicyManagement {
    public static void main(String[] args) {
        PolicyManagementSystem policyManagementSystem = new PolicyManagementSystem();

        // Adding policies to system
        policyManagementSystem.addPolicy(new Policy(1, "Raju", 20, "Health", 1500));
        policyManagementSystem.addPolicy(new Policy(2, "Shyam", 18, "Health", 2000));
        policyManagementSystem.addPolicy(new Policy(3, "Rishi", 22, "Term Life", 2000));
        policyManagementSystem.addPolicy(new Policy(4, "Saini", 25, "Term Life", 1500));
        policyManagementSystem.addPolicy(new Policy(6, "Shan", 20, "Health", 2500));
        policyManagementSystem.addPolicy(new Policy(5, "Arpit", 12, "Health", 1900));

        // Printing the policy by exp date
        policyManagementSystem.displayPolicyByExpDate();

        // Display all unique policy
        policyManagementSystem.displayAllPolicies();

        // Printing the coverage type
        policyManagementSystem.displayCoverage("Home");
    }
}
