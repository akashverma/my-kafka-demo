package com.example.A.service;

import com.example.A.dtos.StudentRequest;
import com.example.A.repos.Student;
import com.example.A.repos.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void registerStudent(StudentRequest request) {
        Student student = new Student();
        student.setFavoriteSubject(request.getSubject());
        student.setName(request.getName());

        Student savedStudent = studentRepository.save(student);
        log.info("Saving student in DB: {}", savedStudent.getId());

    }

    public Student getStudent(String id) {
        Optional<Student> student = studentRepository.findById(Long.valueOf(id));
        return student.get();
    }


}



