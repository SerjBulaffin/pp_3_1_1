package com.example.jvm_boot.repository;



import com.example.jvm_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    public User getUserByFirstName(String name);
}
