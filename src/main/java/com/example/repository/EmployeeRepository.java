package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This annotation is not a mandatory one
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
