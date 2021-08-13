package com.example.A.controller;

import com.example.A.dtos.StudentRequest;
import com.example.A.repos.Student;
import com.example.A.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/register")
    public void regStudent(@RequestBody StudentRequest studentRequest){
        studentService.registerStudent(studentRequest);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudent(id);
    }

}
