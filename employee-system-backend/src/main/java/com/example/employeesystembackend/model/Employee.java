package com.example.employeesystembackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Model is an structure that will interact with the UI.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private Long id;
  private String firstName;
  private String lastName;
  private String emailID;
}
