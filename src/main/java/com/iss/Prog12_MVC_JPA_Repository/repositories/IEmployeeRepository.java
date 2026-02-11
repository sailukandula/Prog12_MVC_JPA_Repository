package com.iss.Prog12_MVC_JPA_Repository.repositories;

import com.iss.Prog12_MVC_JPA_Repository.entities.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeData, Integer> {
}
