package com.example.demo;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Reference {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "saveEmployee")
    //If readOnly property is set then the record wil not be saved in the database.
    @Transactional(readOnly = true)
    public Employee saveEmployee() {

        Employee em = new Employee();
        em.setId(60L);
        employeeService.save(em);

        return em;
    }
}