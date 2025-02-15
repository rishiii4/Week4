package testbasicjunit;

import junit.basicjunittest.PerformanceTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceTestingTest {
    @Test
    @Timeout(value = 2)
    void testLongRunningTaskTimeout() throws InterruptedException {
        PerformanceTesting pt = new PerformanceTesting();
        String result = pt.longRunningTask();
        assertEquals("Task Completed", result, "Method should return 'Task Completed'");
    }

}
