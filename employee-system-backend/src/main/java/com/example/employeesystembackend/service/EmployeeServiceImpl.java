package com.example.employeesystembackend.service;

import com.example.employeesystembackend.entity.EmployeeEntity;
import com.example.employeesystembackend.model.Employee;
import com.example.employeesystembackend.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

  @Override
  public List<Employee> getAllEmployees() {
    List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
    List<Employee> employees = employeeEntities.stream().map(emp -> new Employee(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmailID()))
            .collect(Collectors.toList());
    return employees;

  }
}
