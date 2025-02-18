package reflection.basiclevel.dynamicallycreateobject;

import java.lang.reflect.Constructor;

class Student{
    private String name;
    private int rollNum;

    public Student(String name, int rollNum){
        this.name = name;
        this.rollNum = rollNum;
    }
    public Student(){}

    public void display(){
        System.out.println("Name: "+name + ", Roll no.: "+rollNum);
    }
}
public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception{

        Class<?> cls = Student.class;

        // Get Constructor
        Constructor constructor = cls.getDeclaredConstructor(String.class, int.class);

        // Create instance dynamically
        Student stu = (Student) constructor.newInstance("Rohan",22);

        // Display details
        stu.display();


    }
}
