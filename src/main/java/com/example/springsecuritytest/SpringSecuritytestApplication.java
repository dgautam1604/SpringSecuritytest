package com.example.springsecuritytest;

import com.example.springsecuritytest.entity.Student;
import com.example.springsecuritytest.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecuritytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecuritytestApplication.class, args);
    }

//    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
//        return args -> {
//            Student maria=new Student((long) 3,"Maria","1234","USER");
//            studentRepo.save(maria);
//        };
//    }
}
