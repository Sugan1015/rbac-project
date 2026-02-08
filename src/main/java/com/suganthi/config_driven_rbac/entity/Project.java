package com.suganthi.config_driven_rbac.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String projectName;
    private Double budget;

    // getters & setters
}

