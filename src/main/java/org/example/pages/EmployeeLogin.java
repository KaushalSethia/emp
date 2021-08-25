package org.example.pages;

import java.sql.*;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.commons.Messages;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.http.Link;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;
import org.example.entities.Employee;
import org.example.helper.EmployeeList;
import org.example.services.UserValidation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeLogin {

   /* @InjectComponent
    private TextField usernameField;*/

    /*@InjectComponent
    private PasswordField passwordField;*/
   /* @Inject
    private PageRenderLinkSource pageRenderLinkSource;*/

   /* @Property
    private Employee employee;*/

    @Property
    private String username;

    @Property
    private String password;

    @Inject
    private UserValidation validation;

    @Component
    private Form employeeLogin;
    /*List<Employee> employees;
    EmployeeList employeeList = new EmployeeList();*/


    @InjectPage
    private EmployeeDetail employeeDetail;

    @Inject
    private Messages messages;
    void onValidateFromEmployeeLogin(){
        if(!validation.isValid(username, password) ) {
            employeeLogin.recordError(messages.get("error"));
        }
    }

    Object onSuccessFromEmployeeLogin(){
                return EmployeeDetail.class;
    }
}
