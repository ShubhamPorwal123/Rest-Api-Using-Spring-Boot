package com.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
