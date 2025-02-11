package universitycourse;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Exam-Based Courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Sharma"));
        examCourses.addCourse(new ExamCourse("Physics", "Dr. Verma"));

        // Assignment-Based Courses
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering", "Prof. Kumar"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Systems", "Prof. Iyer"));

        // Research-Based Courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research", "Dr. Gupta"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "Dr. Mehta"));

        // Display individual course categories
        examCourses.displayCourses();
        assignmentCourses.displayCourses();
        researchCourses.displayCourses();

        // Display all courses using wildcard method
        Course.displayAllCourses(examCourses.getCourses());
        Course.displayAllCourses(assignmentCourses.getCourses());
        Course.displayAllCourses(researchCourses.getCourses());
    }
}
