package insurancepolicymanagement;

public class PolicyManagement {
    public static void main(String[] args) {
        // Creating object of policy mgmt system
        InsurancePolicy policyManagement = new InsurancePolicy();

        // Adding new policies to system
        policyManagement.addPolicy(new Policy(1, "Raju", 20, "Health", 1500));
        policyManagement.addPolicy(new Policy(2, "Shyam", 18, "Health", 2000));
        policyManagement.addPolicy(new Policy(3, "Rishi", 22, "Term Life", 2000));
        policyManagement.addPolicy(new Policy(4, "Saini", 25, "Term Life", 1500));
        policyManagement.addPolicy(new Policy(6, "Shan", 20, "Health", 2500));
        policyManagement.addPolicy(new Policy(5, "Arpit", 12, "Health", 1900));
        policyManagement.addPolicy(new Policy(6, "Ajay", 10, "Health", 3000));

        // Retrieving policy by its number
        System.out.println(policyManagement.getPolicy(3));

        // Display all policies expiring within the next 30 days.
        policyManagement.displayExpiringWithin30Days();

        // List all policies for a specific policyholder
        policyManagement.displayByPolicyHolder("ABC");

        // Remove expired policies
        policyManagement.removeExpiredPolicies();
    }
}

