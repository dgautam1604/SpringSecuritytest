package com.example.springsecuritytest.service;

import com.example.springsecuritytest.entity.Student;
import com.example.springsecuritytest.repository.StudentRepo;
import com.example.springsecuritytest.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentSevice implements UserDetailsService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student=studentRepo.findByUsername(username);

        if(student==null)
            throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(student);
    }
}
