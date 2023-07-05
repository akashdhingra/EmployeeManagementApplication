package com.example.employeesystembackend.entity;

import jakarta.persistence.*;
import lombok.Data;


// Entity is basically a table that will be added to database.
@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String emailID;


}
