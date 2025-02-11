package aidrivenresume;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    // Add a resume
    public void addResume(T resume) {
        resumes.add(resume);
    }

    // Get all resumes
    public List<T> getResumes() {
        return resumes;
    }

    // Display all resumes
    public void displayResumes() {
        System.out.println("\nResumes for " + (resumes.isEmpty() ? "No Role" : resumes.get(0).getClass().getSimpleName()) + ":");
        for (T resume : resumes) {
            System.out.println(resume);
        }
    }

    // Static method to process any type of resumes using Wildcards
    public static void processAllResumes(List<? extends JobRole> resumes) {
        System.out.println("\nProcessing Resumes: ");
        for (JobRole resume : resumes) {
            System.out.println(resume);
        }
    }
}
