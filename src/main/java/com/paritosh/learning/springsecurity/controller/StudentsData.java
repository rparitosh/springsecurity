package com.paritosh.learning.springsecurity.controller;

import com.paritosh.learning.springsecurity.domain.Student;

import java.util.List;

public class StudentsData {
    public static final List<Student> STUDENTS = List.of(new Student[]{
            new Student(1,"Paritosh Raut"),
            new Student(2,"Aruna Raut"),
            new Student(3,"Zane Krishnia")
    });
}
