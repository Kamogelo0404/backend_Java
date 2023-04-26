package com.employee.employee.system.models;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;

//entity is an object for database
@Entity
public class Employee {
    public int empId;
    public String name;
    public String lastName;
    public String email;
    public String department;
    public String contactNo;

    //create an empty object to display data stored in postman
    public Employee() {

    }

    // create a constructor to initialize variables and should be the same as java
    // file
    public Employee(int empId, String name, String lastName, String email, String department, String contactNo) {

        // initialize variables all of them using this
        this.empId = empId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.contactNo = contactNo;
    }

    @Id // create your id automatically
    @GeneratedValue // value generated from the application

    // now use the get and set methods to help you get and set the variables
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    // now create your model that will connect with your controller using the
    // repository(interface)
}