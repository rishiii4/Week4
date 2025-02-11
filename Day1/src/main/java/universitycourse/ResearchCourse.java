package universitycourse;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}
