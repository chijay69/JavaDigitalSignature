package com.example.demo.service;

import com.example.demo.model.EmployeeImages;
import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeeImagesRepository;
import com.example.demo.repository.EmployeesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class EmployeeImageServiceImpl {

    @Autowired
    private EmployeeImagesRepository employeeImagesRepository;

    @Transactional(value = "tm1") // Using tm1 transaction manager
    public void saveEmployeeAndImage(EmployeeImages image) {
//        employeesRepository.save(employee);
        employeeImagesRepository.save(image);
    }

    @Transactional(value = "chainedTransactionManager") // Using chained transaction manager
    public void saveEmployeeAndImageWithChainedTransaction(EmployeeImages image) {
//        employeesRepository.save(employee);
        employeeImagesRepository.save(image);
    }
}
