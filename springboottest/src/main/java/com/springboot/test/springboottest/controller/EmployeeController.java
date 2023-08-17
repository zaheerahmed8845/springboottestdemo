package com.springboot.test.springboottest.controller;

import com.springboot.test.springboottest.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/v1/employees/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId) {
        Employee employee = new Employee(1, "Test 1");
        return new ResponseEntity<Employee>(employee, HttpStatus.ACCEPTED);

    }

}
