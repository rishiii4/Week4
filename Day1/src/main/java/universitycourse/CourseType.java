package universitycourse;

abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() { return courseName; }

    public String getInstructor() { return instructor; }

    public abstract String getEvaluationType(); // Must be implemented by subclasses

    @Override
    public String toString() {
        return courseName + " | Instructor: " + instructor + " | Evaluation: " + getEvaluationType();
    }
}
