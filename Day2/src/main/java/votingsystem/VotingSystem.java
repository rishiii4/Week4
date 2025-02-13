package votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    // Votes are stored in a HashMap
    HashMap<String, Integer> candidates;
    // TreeMap to display the results in sorted order
    TreeMap<Integer, String> result;
    // LinkedHashMap to maintain the order of votes
    LinkedHashMap<Integer, String> votes;

    VotingSystem() {
        candidates = new HashMap<>();
        result = new TreeMap<>();
        votes = new LinkedHashMap<>();
    }

    public void addCandidate(String name, Integer votes) {
        candidates.put(name, votes);
        result.put(votes, name);
        this.votes.put(votes, name);
    }

    // Method to display results
    public void displayResult() {
        for(Map.Entry<Integer, String> candidate : result.entrySet()) {
            System.out.println("Candidate Name: "+ candidate.getValue() + ", Candidate Votes: "+ candidate.getKey());
        }
    }

    // Method to display votes and candidate
    public void displayOrderByVotes() {
        for(Map.Entry<Integer, String> candidate : votes.entrySet()) {
            System.out.println("Candidate Name: "+ candidate.getValue() + ", Candidate Votes: "+ candidate.getKey());
        }
    }
    public static void main(String[] args) {
        // Object of voting system
        VotingSystem votingSystem = new VotingSystem();

        // Adding candidates with their votes
        votingSystem.addCandidate("Rishi", 5);
        votingSystem.addCandidate("Arpit", 50);
        votingSystem.addCandidate("Mohit", 45);
        votingSystem.addCandidate("Dharmendra", 100);

        // Printing the order of votes
        System.out.println("Order of votes :-");
        votingSystem.displayOrderByVotes();

        // Displaying result
        System.out.println("Result :-");
        votingSystem.displayResult();
    }
}
