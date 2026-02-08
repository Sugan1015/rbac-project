package com.suganthi.config_driven_rbac.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "field_permissions")
public class FieldPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fieldName;
    private Boolean canView;
    private Boolean canEdit;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission permission;

    // getters & setters
}

