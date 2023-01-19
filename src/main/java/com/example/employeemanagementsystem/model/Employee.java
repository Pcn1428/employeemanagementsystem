package com.example.employeemanagementsystem.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String position;
    private String phoneNumber;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;
}
