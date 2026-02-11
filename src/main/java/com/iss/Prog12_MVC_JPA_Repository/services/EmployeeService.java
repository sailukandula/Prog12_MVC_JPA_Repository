package com.iss.Prog12_MVC_JPA_Repository.services;

import com.iss.Prog12_MVC_JPA_Repository.entities.EmployeeData;
import com.iss.Prog12_MVC_JPA_Repository.repositories.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public void save(EmployeeData employeeData) {
    employeeRepository.save(employeeData);

    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public void update(EmployeeData employeeData) {
        employeeRepository.save(employeeData);
    }

    @Override
    public List<EmployeeData> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeData getEmployeeById(int id){
        return  employeeRepository.findById(id).orElse(null);
    }
}
