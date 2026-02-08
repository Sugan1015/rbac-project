package com.suganthi.config_driven_rbac.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // ADMIN / EDITOR / USER

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}



