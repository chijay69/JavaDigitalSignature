package com.example.demo.service;

import com.example.demo.model.Employees;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService{

    void saveEmployee(Employees employees);
    void saveEmployeeWithChainedTransaction(Employees employee);
}
