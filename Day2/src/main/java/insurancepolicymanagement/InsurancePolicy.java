package insurancepolicymanagement;

import java.util.*;

public class InsurancePolicy {

    private HashMap<Integer, Policy> policies;

    private Map<Integer, Policy> orderPolicies;

    private Map<Integer, Policy> expiryPolicies;

    InsurancePolicy () {
        policies = new HashMap<>();
        orderPolicies = new LinkedHashMap<>();
        expiryPolicies = new TreeMap<>();
    }

    // Adding policy
    public void addPolicy(Policy policy) {
        policies.put(policy.getPolicyNumber(), policy);
        orderPolicies.put(policy.getPolicyNumber(), policy);
        expiryPolicies.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number.
    public Policy getPolicy(Integer policyKey) {
        return policies.getOrDefault(policyKey, new Policy());
    }

    // Display all policies expiring within the next 30 days.
    public void displayExpiringWithin30Days() {
        for(Policy policy : expiryPolicies.values()) {
            if(policy.getExpiryDate() <= 30) {
                System.out.println(policy);
            }
        }
    }

    // List all policies for a specific policyholder.
    public void displayByPolicyHolder(String name) {
        for(Policy policy : policies.values()) {
            if(Objects.equals(policy.getPolicyholderName(), name)) {
                System.out.println(policy);
            }
        }
    }

    //Remove policies that are expired.
    public void removeExpiredPolicies() {
        for(Policy policy : expiryPolicies.values()) {
            if(policy.getExpiryDate() <= 0) {
                expiryPolicies.remove(policy.getPolicyNumber());
                policies.remove(policy.getPolicyNumber());
                orderPolicies.remove(policy.getPolicyNumber());
            }
        }
        System.out.println("Removed policies that are expired.");
    }

}
