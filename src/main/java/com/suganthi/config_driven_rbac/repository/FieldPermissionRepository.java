package com.suganthi.config_driven_rbac.repository;

import com.suganthi.config_driven_rbac.entity.FieldPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldPermissionRepository extends JpaRepository<FieldPermission, Long> {
    List<FieldPermission> findByPermissionId(Long permissionId);
}

