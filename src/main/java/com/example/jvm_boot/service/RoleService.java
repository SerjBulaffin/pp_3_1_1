package com.example.jvm_boot.service;

import com.example.jvm_boot.entity.Role;

import java.util.List;

public interface RoleService {
    public Role getRoleByName(String name);
    public Role getRoleById(Long id);
    public List<Role> allRoles();
}
