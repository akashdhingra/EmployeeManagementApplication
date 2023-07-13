package com.example.employeesystembackend.model;

import lombok.Data;

// Model is an structure that will interact with the UI.
@Data
public class Employee {
  private Long id;
  private String firstName;
  private String lastName;
  private String emailID;
}
