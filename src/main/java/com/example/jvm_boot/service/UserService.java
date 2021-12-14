package com.example.jvm_boot.service;

import com.example.jvm_boot.entity.User;

import java.util.List;

public interface UserService {
    public User getUser(Long id);
    public User getUserByFirstName(String name);
    public List<User> getAllUsers();
    public void addUpdateUser(User user);
    public void removeUserById(Long id);
}
