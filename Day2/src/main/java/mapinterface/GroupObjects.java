package mapinterface;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjects {
    public static void main(String[] args) {
        // Employee list
        List<Employee> employees = Arrays.asList(
                new Employee("Rishi", "HR"),
                new Employee("Arpit", "IT"),
                new Employee("Dharmendra", "HR"),
                new Employee("Mohit", "Finance")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print result
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        return departmentMap;
    }
}

