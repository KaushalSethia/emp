package org.example.entities;

import org.apache.tapestry5.beaneditor.NonVisual;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp.employees")
public class Employee {

    /*@Column(name = "UserName")*//*
    private String username;

    *//*@Column(name = "Password")*//*
    private String password;*/

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "FName")
    private String firstName;

    @Column(name = "LName")
    private String lastName;

    @Column(name="Age")
    private int age;
/*
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

}
