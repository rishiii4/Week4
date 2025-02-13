package policymanagement;

import java.util.*;

public class PolicyManagementSystem {
    // hash set for quick lookup
    private HashSet<Policy> lookup;

    // linked hash set to maintain order
    private Set<Policy> order;

    //TreeSet to maintain policies sorted by expiry date.
    private NavigableSet<Policy> expDate;

    // constructor
    PolicyManagementSystem() {
        lookup = new HashSet<>();
        order = new LinkedHashSet<>();
        expDate = new TreeSet<>();
    }

    // adding policy into the storage
    public void addPolicy(Policy policy) {
        lookup.add(policy);
        order.add(policy);
        expDate.add(policy);
    }

    //display All unique policies.
    public void displayAllPolicies() {
        System.out.println(lookup);
    }

    // display policy sorted by date
    public void displayPolicyByExpDate() {
        System.out.println(expDate);
    }

    // displaying policy type based on coverage type
    public void displayCoverage(String coverageType) {
        for(Policy policy : lookup) {
            if (Objects.equals(policy.getCoverageType(), coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // display policy by order
    public void displayAllPolicyByOrder() {
        System.out.println(order);
    }
}
