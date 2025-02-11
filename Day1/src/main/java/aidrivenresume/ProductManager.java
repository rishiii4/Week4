package aidrivenresume;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRequiredSkills() {
        return "Leadership, Agile, Market Research, Strategy";
    }
}
