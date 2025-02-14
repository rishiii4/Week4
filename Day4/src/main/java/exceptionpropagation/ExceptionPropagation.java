package exceptionpropagation;

public class ExceptionPropagation {

    // Method1 - This will throw ArithmeticException
    public static void method1() {
        int result = 10 / 0;
    }

    // Method2 - Calls Method1
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            // Calling Method2
            method2();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            // Finally printing message
            System.out.println("Handled exception in main");
        }
    }
}

