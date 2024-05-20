package com.prashant.springmvc.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginForm")
    public String loginForm() {
        return "fancy-login";
    }
}
