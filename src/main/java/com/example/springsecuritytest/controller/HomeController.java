package com.example.springsecuritytest.controller;

import com.example.springsecuritytest.entity.Student;
import com.example.springsecuritytest.service.StudentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    StudentSevice s=new StudentSevice();
    @GetMapping("/")
    public String welcome(){
        return "Welcome" ;
    }
    @GetMapping("/home")
    public String home(){
        return "Welcome to Home" ;
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome to Admin page";
    }
    @GetMapping("/find")
    public List<Student> findAllStudents(){
        return s.getAll();
    }

    @GetMapping("/find/{id}")
    public Student findStudentById(@PathVariable int id){
        return s.getStudentById(id);
    }
}
