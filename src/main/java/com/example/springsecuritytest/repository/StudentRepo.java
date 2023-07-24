package com.example.springsecuritytest.repository;

import com.example.springsecuritytest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    Student findByUsername(String username);
}
