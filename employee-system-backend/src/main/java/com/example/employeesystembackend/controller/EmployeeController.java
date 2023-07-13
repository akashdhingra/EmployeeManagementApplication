package com.example.employeesystembackend.controller;

import com.example.employeesystembackend.model.Employee;
import com.example.employeesystembackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Controller will control all our request.
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping("/employees")
  public Employee createEmployee(@RequestBody Employee employee){
    return employeeService.createEmployee(employee);
  }
}
