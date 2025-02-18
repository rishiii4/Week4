package reflection.intermediatelevel.dynamicallymethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations mathOperations = new MathOperations();
        Class<?> cls = mathOperations.getClass();


        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking input of operation from user
        System.out.println("Enter Opreation (add, subtract, multiply, divide):");
        String str = input.next();

        // Taking input of num1 from user
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();

        // Taking input of num2 from user
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();


        Method method1 = cls.getMethod(str, int.class, int.class);
        int result = (int) method1.invoke(mathOperations,num1,num2);

        // Display result
        System.out.println(result);
    }
}
