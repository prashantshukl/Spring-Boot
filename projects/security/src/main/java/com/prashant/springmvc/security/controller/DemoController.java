package com.prashant.springmvc.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String demoHome() {
        return "home";
    }

    @GetMapping("/leaders")
    public String retreat() {
        return "retreat-page";
    }

    @GetMapping("/systems")
    public String admin() {
        return "cruise-page";
    }

    @GetMapping("/customAccessDenied")
    public String deneidPage() {
        return "deniedPage";
    }

}
