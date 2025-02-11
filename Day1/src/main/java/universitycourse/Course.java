package universitycourse;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    // Add a course
    public void addCourse(T course) {
        courses.add(course);
    }

    // Get all courses
    public List<T> getCourses() {
        return courses;
    }

    // Display all courses
    public void displayCourses() {
        System.out.println("Courses Offered:");
        for (T course : courses) {
            System.out.println(course);
        }
    }

    // Static Method to Display Any Type of Courses using Wildcards
    public static void displayAllCourses(List<? extends CourseType> courses) {
        System.out.println("\n=== Displaying All Courses ===");
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
