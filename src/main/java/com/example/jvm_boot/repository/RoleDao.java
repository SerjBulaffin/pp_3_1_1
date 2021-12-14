package com.example.jvm_boot.repository;


import com.example.jvm_boot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleDao extends JpaRepository<Role, Long> {
   public Role getRoleByRole(String role);
}
