package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "EMPLOYEE_IMAGES")
public class EmployeeImages {
    @Id
    @Column(name = "REGISTRATION_CODE")
    private String registrationCode;
    @Column(name = "PIN")
    private String pin;
    @Column(name = "SIGNATURE_IMAGE")
    private String signatureImage;
}
