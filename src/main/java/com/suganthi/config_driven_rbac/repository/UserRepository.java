package com.suganthi.config_driven_rbac.repository;

import com.suganthi.config_driven_rbac.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

