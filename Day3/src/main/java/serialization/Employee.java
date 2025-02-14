package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private String department;

    // Constructor to initialize Employee object
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // setter and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{ID=" + id + ", Name='" + name + "', Department='" + department + "'}";
    }
}
