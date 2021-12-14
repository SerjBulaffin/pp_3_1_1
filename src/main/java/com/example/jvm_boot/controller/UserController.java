package com.example.jvm_boot.controller;

import com.example.jvm_boot.entity.User;
import com.example.jvm_boot.service.RoleServiceImpl;
import com.example.jvm_boot.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.security.Principal;

@Controller
public class UserController {

    private UserDetailsServiceImpl userDetailsService;
    private RoleServiceImpl roleService;

    @Autowired
    public UserController(UserDetailsServiceImpl userDetailsService, RoleServiceImpl roleService) {
        this.userDetailsService = userDetailsService;
        this.roleService = roleService;
    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        User user = userDetailsService.getUserByFirstName(principal.getName());
        model.addAttribute("user", user);

        return "user";
    }
}
