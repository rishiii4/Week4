package reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

class Person{
    private int age = 19;
}
public class AccessPrivateFields {
    public static void main(String[] args) throws Exception{
        Person person = new Person();
        Class<?> cls1 = person.getClass();

        // Access private field
        Field field = cls1.getDeclaredField("age");

        // Allow access to private field
        field.setAccessible(true);

        // Get field value
        System.out.println("Age:"+ field.get(person));

        // Modify field value
        field.set(person, 20);

        // Get field updated value
        System.out.println("Age:"+ field.get(person));

    }
}
