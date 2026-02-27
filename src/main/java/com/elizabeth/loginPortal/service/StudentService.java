package com.elizabeth.loginPortal.service;

import com.elizabeth.loginPortal.controller.StudentController;
import com.elizabeth.loginPortal.model.Student;
import com.elizabeth.loginPortal.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void registration(Student s){
        studentRepo.save(s);
    }

}
