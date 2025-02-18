package reflection.advancedlevel.methodtimer;

class Main {
    public static void main(String[] args) throws InterruptedException {
        ExampleClass example = new ExampleClass();

        // Measure execution time of methods annotated with @Timed
        MethodTimer.measureExecutionTime(example);
    }
}
