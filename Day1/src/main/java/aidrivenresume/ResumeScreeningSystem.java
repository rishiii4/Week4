package aidrivenresume;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Software Engineer Resumes
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Amit Sharma", 5));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Neha Gupta", 3));

        // Data Scientist Resumes
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Rahul Verma", 4));
        dataScientistResumes.addResume(new DataScientist("Sneha Iyer", 6));

        // Product Manager Resumes
        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Ravi Mehta", 8));
        productManagerResumes.addResume(new ProductManager("Pooja Singh", 7));

        // Display individual job role resumes
        softwareEngineerResumes.displayResumes();
        dataScientistResumes.displayResumes();
        productManagerResumes.displayResumes();

        // Process all resumes using wildcard method
        Resume.processAllResumes(softwareEngineerResumes.getResumes());
        Resume.processAllResumes(dataScientistResumes.getResumes());
        Resume.processAllResumes(productManagerResumes.getResumes());
    }
}
