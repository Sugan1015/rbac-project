package com.suganthi.config_driven_rbac.repository;

import com.suganthi.config_driven_rbac.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByUserId(Long userId);
}

