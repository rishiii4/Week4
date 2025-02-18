package reflection.advancedlevel.methodtimer;

class ExampleClass {

    @Timed
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    @Timed
    public void slowMethod() throws InterruptedException {
        System.out.println("Executing slowMethod...");
        Thread.sleep(1000); // Simulate a slow operation
    }

    public void ignoredMethod() {
        System.out.println("This method is not timed.");
    }
}
