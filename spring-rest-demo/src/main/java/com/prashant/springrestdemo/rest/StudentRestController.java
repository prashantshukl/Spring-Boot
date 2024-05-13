package com.prashant.springrestdemo.rest;


import com.prashant.springrestdemo.entity.Student;
import com.prashant.springrestdemo.entity.StudentNotFoundException;
import com.prashant.springrestdemo.entity.StudentNotFoundResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("student id Not found for id :" + studentId);
        }
        return theStudents.get(studentId);
    }
}
