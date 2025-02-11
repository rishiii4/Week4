package aidrivenresume;

abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    // Method to get candidate name
    public String getCandidateName() {
        return candidateName;
    }

    // Method to get candidate experience
    public int getExperienceYears() {
        return experienceYears;
    }

    public abstract String getRequiredSkills(); // Must be implemented by subclasses

    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Experience: " + experienceYears + " years | Skills: " + getRequiredSkills();
    }
}
