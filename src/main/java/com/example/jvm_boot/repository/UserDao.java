package com.example.jvm_boot.repository;

import com.example.jvm_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User getUserByFirstName(String name);
}
