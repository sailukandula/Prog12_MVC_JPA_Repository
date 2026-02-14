package com.iss.Prog12_MVC_JPA_Repository.entities;

import com.iss.Prog12_MVC_JPA_Repository.customValidators.ValidateEmployeeType;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeData {

    @Id
    private int id;
    private String name;
    private double salary;
    @ValidateEmployeeType
    private String employeeType;
}
