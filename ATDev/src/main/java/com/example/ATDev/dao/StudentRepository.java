package com.example.ATDev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ATDev.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
