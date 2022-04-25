package com.vanthuandev.userservice.repo;

import com.vanthuandev.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
