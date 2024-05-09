package com.prashant.springrestdemo.rest;


import com.prashant.springrestdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents= new ArrayList<>();
        theStudents.add(new Student("Aman", "Singh"));
        theStudents.add(new Student("Aman", "Patel"));
        theStudents.add(new Student("Prashant", "Shukla"));
    }

    // Defining endpoint for /students
    @GetMapping("/students/{studentId}")
    public Student getStudentList(@PathVariable int studentId) {
        return theStudents.get(studentId);
    }
}
