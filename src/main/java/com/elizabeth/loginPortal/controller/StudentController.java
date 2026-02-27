package com.elizabeth.loginPortal.controller;

import com.elizabeth.loginPortal.model.Student;
import com.elizabeth.loginPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/") //home.jsp
    public String home(){
        return "home";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/viewdata")
    public String viewdata(){
        return "viewdata";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/saveform")
    public void saveform(@ModelAttribute Student s){
        studentService.registration(s);
    }
}
