package com.example.jvm_boot.repository;


import com.example.jvm_boot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
   Role getRoleByRole(String role);
}
