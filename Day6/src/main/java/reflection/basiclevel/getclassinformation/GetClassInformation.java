package reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee{
     int id;
     String name;



    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee(){}

    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }

}

public class GetClassInformation {
    public static void main(String[] args)  throws Exception{

        // Getting class name
        Employee emp = new Employee();
        Class<?> cls1 = emp.getClass();
        System.out.println("Class Name: "+cls1.getName());

        System.out.println("=================================");

        // Getting constructor
        Constructor<?> constructor = cls1.getConstructor();
        System.out.println(constructor);


        System.out.println("=================================");

        // Getting fields
        Field field = cls1.getDeclaredField("name");
        System.out.println(field);

        System.out.println("=================================");

        // Getting methods
        Method methods[] = cls1.getMethods();
        for (Method method: methods){
            System.out.println(method);
        }

    }
}
