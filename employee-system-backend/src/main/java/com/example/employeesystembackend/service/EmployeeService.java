package com.example.employeesystembackend.service;


import com.example.employeesystembackend.model.Employee;

import java.util.List;

public interface EmployeeService {
  Employee createEmployee(Employee employee);

  List<Employee> getAllEmployees();
}