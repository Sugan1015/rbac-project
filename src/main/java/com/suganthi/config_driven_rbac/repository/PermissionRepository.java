package com.suganthi.config_driven_rbac.repository;

import com.suganthi.config_driven_rbac.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Optional<Permission>
    findByRoleIdAndTableNameAndColumnName(
            Long roleId,
            String tableName,
            String columnName
    );
}




