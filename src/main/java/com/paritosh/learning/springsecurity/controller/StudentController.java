package com.paritosh.learning.springsecurity.controller;

import com.paritosh.learning.springsecurity.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private static List<Student> STUDENTS = List.of(new Student[]{
            new Student(1,"Paritosh Raut"),
            new Student(2,"Aruna Raut"),
            new Student(3,"Zane Krishnia")
    });

    @GetMapping("api/v1/Student/{id}")
    public Student getStudentById(@PathVariable int id){
        return STUDENTS
                .stream()
                .filter(student -> id == student.getId())
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + id + " not found"));

    }
}
