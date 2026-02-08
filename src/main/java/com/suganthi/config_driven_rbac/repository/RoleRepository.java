package com.suganthi.config_driven_rbac.repository;

import com.suganthi.config_driven_rbac.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}


