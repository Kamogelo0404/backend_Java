package com.employee.employee.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.system.models.Employee;
import com.employee.employee.system.repo.EmployeeRepo;







//specification of controller,@ call's a library
@RestController
@RequestMapping(value = "/employees")// tell the rest controller to request
public class EmployeeController {

    // call our repo, connect the files with
    @Autowired
    private EmployeeRepo employeeRepo;// EmployeeRepo acts as an object and employeeRepo is a variable

    @GetMapping
    // list display all the objects you have and call the model
    public List<com.employee.employee.system.models.Employee> getEmployees() {

        return employeeRepo.findAll();
    }

    //to play the data on postman
    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee) {
         return employeeRepo.save(employee);
    }
    
    //to edit/update the data on postman
    @PutMapping("{id}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
}   