package annotations.exercise.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Retain annotation at runtime for reflection
@Retention(RetentionPolicy.RUNTIME)
// Apply annotation only on methods
@Target(ElementType.METHOD)
public @interface TaskInfo {
    int priority(); // Priority of the task
    String assignedTo(); // Name of the assigned person
}

