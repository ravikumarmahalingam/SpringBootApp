package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    //We will not be able to autowire this class if the component scan annotation is
    // not given in the DemoApplication class
    @Autowired
    EmployeeRepository employeeRepository;


    public void save(Employee em) {
        employeeRepository.save(em);
    }
}
