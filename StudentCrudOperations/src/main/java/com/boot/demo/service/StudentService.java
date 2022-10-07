package com.boot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.entity.Student;
import com.boot.demo.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public List<Student> getStudents()
	{
		return repository.findAll();
	}
	
	public Optional<Student> getStudentById(int id)
	{
		return repository.findById(id);
	}
	
	public String deleteStudent(int id)
	{
		repository.deleteById(id);
		return "product removed : " + id;
	}
	
	public Student updateStudent(Student student) {
		Student existingContact = repository.findById(student.getRollno()).orElse(null);
		existingContact.setStuName(student.getStuName());
		existingContact.setEmail(student.getEmail());
        existingContact.setMarks(student.getMarks());
        return repository.save(existingContact);
    }
}
