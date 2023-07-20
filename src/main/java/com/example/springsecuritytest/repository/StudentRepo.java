package com.example.springsecuritytest.repository;

import com.example.springsecuritytest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
