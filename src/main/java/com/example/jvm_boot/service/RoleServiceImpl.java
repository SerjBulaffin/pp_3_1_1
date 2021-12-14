package com.example.jvm_boot.service;

import com.example.jvm_boot.entity.Role;
import com.example.jvm_boot.repository.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Role getRoleByName(String name) {
        return roleDao.getRoleByRole(name);
    }

    public Role getRoleById(Long id) {
        return roleDao.getById(id);
    }

    public List<Role> allRoles() {
        return roleDao.findAll();
    }
}
