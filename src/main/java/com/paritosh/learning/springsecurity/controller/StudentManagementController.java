package com.paritosh.learning.springsecurity.controller;

import com.paritosh.learning.springsecurity.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management/api/v1/students/")
public class StudentManagementController {

    @GetMapping
    public List<Student> getAllStudents(){
        return StudentsData.STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("Added - "+ student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable Integer studentId){
        System.out.println("Delete - " + studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student){
        System.out.println("udpate - " + studentId + student);
    }

}
