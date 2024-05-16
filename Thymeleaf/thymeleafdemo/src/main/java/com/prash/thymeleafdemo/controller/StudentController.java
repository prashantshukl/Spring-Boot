package com.prash.thymeleafdemo.controller;

import com.prash.thymeleafdemo.enitity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    List<String> countries;

    @GetMapping("/studentForm")
    public String studentForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }


    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent) {

        return "student-confirmation";
    }

}
