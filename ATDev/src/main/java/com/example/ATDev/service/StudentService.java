package com.example.ATDev.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ATDev.dao.StudentRepository;
import com.example.ATDev.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	public Student updateStudent(Student student, Long id) {
		Optional<Student> opStud=studentRepository.findById(id);
		Student stud=opStud.get();
		stud.setId(student.getId());
		stud.setFirstname(student.getFirstname());
		stud.setLastname(student.getLastname());
		stud.setContact(student.getContact());
		stud.setEmail(student.getEmail());
		return studentRepository.save(stud);
	}

	public String deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return "successfully deleted";
	}

}
