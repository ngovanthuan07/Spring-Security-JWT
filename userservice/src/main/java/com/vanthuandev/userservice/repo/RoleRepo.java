package com.vanthuandev.userservice.repo;

import com.vanthuandev.userservice.domain.Role;
import com.vanthuandev.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
