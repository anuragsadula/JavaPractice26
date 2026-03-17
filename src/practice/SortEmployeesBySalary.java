package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class SortEmployeesBySalary {

    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 3000),
                new Employee("Charlie", 6000)
                );

        System.out.println("Employees sorted by salary: ");

       List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());

       System.out.println(sorted);

    }
}
