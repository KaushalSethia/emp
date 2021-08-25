package org.example.helper;

import org.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeList {

    private static List<Employee> employees;

    public EmployeeList(){
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployeeList(){

        return employees;

    }

    public void addNew(Employee e){
        employees.add(e);
    }

    public Optional<Employee> getEmployeeById(long employeeId){
        return getEmployeeList().stream()
                .filter(employee -> employee.getId()==employeeId)
                .findAny();
    }


}
