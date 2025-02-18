package annotations.exercise.customannotation;


public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}


