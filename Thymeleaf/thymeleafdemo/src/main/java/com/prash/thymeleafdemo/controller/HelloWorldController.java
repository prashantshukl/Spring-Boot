package com.prash.thymeleafdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String abc(HttpServletRequest request, Model theModel) {
        String nam = request.getParameter("studentName");
        nam = nam.toUpperCase();
        theModel.addAttribute("message", nam);
        return "helloworld";
    }
}
