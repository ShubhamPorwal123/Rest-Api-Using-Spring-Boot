package com.boot.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.Student;
import com.boot.demo.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }
    
    @GetMapping("/student/{id}")
    public Optional<Student> findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }
}
