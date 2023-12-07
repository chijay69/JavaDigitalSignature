package com.example.demo.service;

import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;


    @Transactional(value = "tm1") // Using tm1 transaction manager
    public void saveEmployee(Employees employee) {
        employeesRepository.save(employee);
//        employeeImagesRepository.save(image);
    }

    @Transactional(value = "chainedTransactionManager") // Using chained transaction manager
    public void saveEmployeeWithChainedTransaction(Employees employee) {
        employeesRepository.save(employee);
//        employeeImagesRepository.save(image);
    }
}
