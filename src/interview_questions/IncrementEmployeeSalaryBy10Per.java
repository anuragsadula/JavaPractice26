package interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    public int empId;

    public String empName;

    public int salary;

    public Employee(int empId, String empName, int salary){

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getId(){
        
        return this.empId;
    }

    public void setId(int empId){

        this.empId = empId;
    }

    public String getName(){

        return this.empName;
    }

    public void setName(String empName){

        this.empName = empName;
    }

    public int getSalary(){
        
        return this.salary;
    }

    public void setSalary(int salary){

        this.salary = salary;
    }
}
public class IncrementEmployeeSalaryBy10Per {

    public static void main(String[] args){

        List<Employee> employeeList = Arrays.asList
        (
            new Employee(1, "Anurag", 19500),
            new Employee(2, "Chandana", 19400),
            new Employee(3, "Charan", 19100),
            new Employee(4, "Vanajakshi", 20001),
            new Employee(5, "Revi", 19999)
        );

        List<Employee> newList = employeeList.stream()
        .filter(emp->emp.getSalary()<=20000)
        .map(emp->{
            emp.setSalary(emp.getSalary()+emp.getSalary()/10);
            return emp;
        })
        .collect(Collectors.toList());

        for(Employee emp:newList){

            System.out.println("EmpId: "+emp.getId()+", Name: "+emp.getName()+", Salary: "+emp.getSalary());
        }
    }

}