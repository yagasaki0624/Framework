package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserForm;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "user-form";
    }

    @RequestMapping("/input-name")
    public String inputName(UserForm userForm) {
        
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        // user.setGender(userForm.getGender());
        user.setPassword(userForm.getPassword());
        session.setAttribute("user", user);
        return "user-lsult1";
        
    }

    @RequestMapping("/user-lsult1")
    public String toLsult1() {
        return "user-lsult1";
    }

    @RequestMapping("/user-lsult2")
    public String toLsult2() {
        return "user-lsult2";
    }

}
