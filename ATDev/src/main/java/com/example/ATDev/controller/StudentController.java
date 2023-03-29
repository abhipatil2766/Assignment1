package com.example.ATDev.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ATDev.entity.Student;
import com.example.ATDev.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student , @RequestParam Long id) {
		return studentService.updateStudent(student,id);	
	}
	
	@DeleteMapping("/student")
	public String deleteById(Long id) {
		return studentService.deleteStudent(id);
	}

}
