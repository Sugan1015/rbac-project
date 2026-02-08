package com.suganthi.config_driven_rbac.service;

import com.suganthi.config_driven_rbac.entity.Permission;
import com.suganthi.config_driven_rbac.repository.PermissionRepository;
import com.suganthi.config_driven_rbac.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private RoleRepository roleRepository;

    // 🔥 ADMIN CHECK
    public boolean isAdmin(Long roleId) {
        return roleRepository.findById(roleId)
                .map(role -> "ADMIN".equalsIgnoreCase(role.getName()))
                .orElse(false);
    }

    // 🔐 FINAL PERMISSION CHECK
    public void checkView(Long roleId, String tableName, String columnName) {

        // ✅ ADMIN → NO RESTRICTION
        if (isAdmin(roleId)) {
            return;
        }

        // ❌ USER → CHECK DB
        Optional<Permission> permission =
                permissionRepository
                        .findByRoleIdAndTableNameAndColumnName(
                                roleId, tableName, columnName
                        );

        if (permission.isEmpty() || !permission.get().isCanView()) {
            throw new ResponseStatusException(
                    HttpStatus.FORBIDDEN,
                    "Access Denied"
            );
        }
    }
}









