package org.example.pages;

import javafx.scene.canvas.GraphicsContext;
import org.apache.tapestry5.FormValidationControl;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.http.Link;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;
//import org.example.components.Kane;
import org.example.dao.EmployeeDao;
import org.example.entities.Employee;
import org.example.helper.EmployeeList;
import org.hibernate.Session;
//import org.example.dao.EmployeeDao;

import java.util.*;

public class EmployeeDetail {

    @Property
    private List<Employee> employees;


    /*@Component
    private Kane kane;*/

    @Property
    private Employee employee;

   /* @Property
    private String username;

    @Property
    private String password;*/

    @Property
    private String firstname;

    @Property
    private String lastname;

    @Property
    private int id;

    @Property
    private int age;

    @Inject
    private Session session;


    @Inject
    private EmployeeDao employeeDao;

    @InjectComponent("employeeDetail")
    private Form form;

    /*public List<Employee> getEmployees()
    {
        return session.createCriteria(Employee.class).list();
    }*/

    EmployeeList employeeList = new EmployeeList();

    /*public List<Employee> getEmployees(){

        return employeeDao.getEmployee();
    }*/

    void setupRender() {
        if (employees == null) {
            employees = employeeDao.getEmployee();
        }
    }

    void onValidateFromEmployeeDetail(){
        if((firstname == null || lastname == null || id <=0 || age<18)){
            form.recordError( "Value must be entered correctly.");
        }
    }

    @CommitAfter
    Object onSuccessFromEmployeeDetail(){
        Employee emp = new Employee();
        /*emp.setPassword(password);
        emp.setUsername(username);*/
        emp.setAge(age);
        emp.setLastName(lastname);
        emp.setFirstName(firstname);
        emp.setId(id);
        employeeList.addNew(emp);
        employeeDao.save(emp);
        //session.persist(emp);
        return EmployeeDetail.class;
    }

}
