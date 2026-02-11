package com.iss.Prog12_MVC_JPA_Repository.services;

import com.iss.Prog12_MVC_JPA_Repository.entities.EmployeeData;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    void save(EmployeeData employeeInfo);
    EmployeeData getEmployeeById(int id);
    void deleteById(int id);
    void update(EmployeeData employeeData);
    List<EmployeeData> getAllEmployees();
}
