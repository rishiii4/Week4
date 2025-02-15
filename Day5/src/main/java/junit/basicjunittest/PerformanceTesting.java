package junit.basicjunittest;

public class PerformanceTesting {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
