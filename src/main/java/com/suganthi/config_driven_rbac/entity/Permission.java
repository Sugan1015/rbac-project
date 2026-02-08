package com.suganthi.config_driven_rbac.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roleId;

    private String tableName;

    private String columnName;

    private boolean canView;

    private boolean canEdit;

    public boolean isCanView() {
        return canView;
    }

    public boolean isCanEdit() {
        return canEdit;
    }
}



