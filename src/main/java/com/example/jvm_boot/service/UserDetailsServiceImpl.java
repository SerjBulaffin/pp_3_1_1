package com.example.jvm_boot.service;

import com.example.jvm_boot.entity.User;
import com.example.jvm_boot.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService, UserService {

    private UserDao userDao;

    @Autowired
    public UserDetailsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    // «Пользователь» – это просто Object. В большинстве случаев он может быть
    //  приведен к классу UserDetails.
    // Для создания UserDetails используется интерфейс UserDetailsService, с единственным методом:
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getUserByFirstName(s);
    }

    //получение юзера по ID
    @Override
    public User getUser(Long id) {
        User user = null;
        Optional<User> optional = userDao.findById(id);
        user = optional.get();

        return user;
    }

    @Override
    public User getUserByFirstName(String name) {
        return getAllUsers().stream().filter(u -> u.getFirstName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void addUpdateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void removeUserById(Long id) {
        userDao.deleteById(id);
    }

}
