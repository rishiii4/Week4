package queueinterface;
import java.util.PriorityQueue;

// Define Patient Class
class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    // Sorting based on severity
    @Override
    public int compareTo(Patient other){
        return Integer.compare(other.severity, this.severity); // Descending Order
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class


HospitalTriageSystem {
    public static void main(String[] args) {
        // Create PriorityQueue for Patients
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Add Patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Process Patients Based on Priority
        System.out.println("Processing Patients in Priority Order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
