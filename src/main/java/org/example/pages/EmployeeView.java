package org.example.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beanmodel.BeanModel;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.dao.EmployeeDao;
import org.example.entities.Employee;
import org.example.helper.EmployeeList;

public class EmployeeView {

    @Inject
    private EmployeeDao employeeDao;

    @Property
    private Employee employee;

    void onActivate(int employeeId){
        employee = employeeDao.getEmployee().get(employeeId-1);
    }

    Object onPassivate() { return employee; }


}
