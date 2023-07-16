package com.example.employeesystembackend.controller;

import com.example.employeesystembackend.model.Employee;
import com.example.employeesystembackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Controller will control all our request.
@CrossOrigin(origins = "http://localhost:3000")
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

  @GetMapping("/employees")
  public List<Employee> getAllEmployees(){
    return employeeService.getAllEmployees();

  }
}
