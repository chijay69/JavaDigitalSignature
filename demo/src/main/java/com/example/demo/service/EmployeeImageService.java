package com.example.demo.service;

import com.example.demo.model.EmployeeImages;
import com.example.demo.model.Employees;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeImageService {
    EmployeeImages saveEmployeeImage(Employees employees, EmployeeImages image);
    EmployeeImages saveEmployeeImageWithChainedTransaction(Employees employee, EmployeeImages image);
}
