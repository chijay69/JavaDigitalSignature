package com.example.demo.repository;

import com.example.demo.model.EmployeeImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeImagesRepository extends JpaRepository<EmployeeImages, String> {
    // Define additional methods if needed
}
