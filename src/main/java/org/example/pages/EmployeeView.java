package org.example.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beanmodel.BeanModel;
import org.example.entities.Employee;
import org.example.helper.EmployeeList;

public class EmployeeView {

    @Property
    private Employee employee;

    // The code

    void onActivate(int id) {
        this.employee.setId(employee.getId());
    }

    Employee onPassivate() {
        return employee;
    }

}
