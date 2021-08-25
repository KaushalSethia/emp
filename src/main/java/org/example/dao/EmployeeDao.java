package org.example.dao;

import java.util.List;
import org.example.entities.Employee;

public interface EmployeeDao {

    void save(Employee employee);

    public List<Employee> getEmployee();
}
