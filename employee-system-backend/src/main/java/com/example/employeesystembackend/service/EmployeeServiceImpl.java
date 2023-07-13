package com.example.employeesystembackend.service;

import com.example.employeesystembackend.entity.EmployeeEntity;
import com.example.employeesystembackend.model.Employee;
import com.example.employeesystembackend.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

// This is a service class, means that all the operations will be performed in this class.
@Service
public class EmployeeServiceImpl implements EmployeeService{

  private EmployeeRepository employeeRepository;

  public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }


  @Override
  public Employee createEmployee(Employee employee) {
    EmployeeEntity employeeEntity = new EmployeeEntity() ;
    BeanUtils.copyProperties(employee, employeeEntity);
    employeeRepository.save(employeeEntity);
    return employee;
  }
}
