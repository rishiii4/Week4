package universitycourse;

public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}
