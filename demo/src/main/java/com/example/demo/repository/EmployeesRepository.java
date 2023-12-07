package com.example.demo.repository;

import com.example.demo.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String> {
    // Define additional methods if needed
}
