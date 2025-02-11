package universitycourse;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}
