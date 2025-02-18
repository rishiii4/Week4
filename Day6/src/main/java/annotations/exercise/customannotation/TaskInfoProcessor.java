package annotations.exercise.customannotation;

import java.lang.reflect.Method;

public class TaskInfoProcessor {
    public static void main(String[] args) {
        try {
            // Get the method object
            Method method = TaskManager.class.getMethod("completeTask");

            // Check if the annotation is present
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve annotation details
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

