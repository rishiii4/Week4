package reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;

class Calculator{
    private int multiply(int a,int b){
        return a*b;
    }
}
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception{
        Calculator calculator = new Calculator();
        Class<?> cls1 = calculator.getClass();

        // Access private method
        Method method = cls1.getDeclaredMethod("multiply", int.class, int.class);
        // Allow access to private method
        method.setAccessible(true);

        // Invoke method dynamically
        int result = (int) method.invoke(calculator, 5, 10);
        // Printing result
        System.out.println("Result: "+result);
    }
}
