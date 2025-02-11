package aidrivenresume;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRequiredSkills() {
        return "Java, SQL, Data Structures, Algorithms";
    }
}
