package com.prashant.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/"  that return hello World
    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Team Name is : " + teamName + " , Coach Name is : "+ coachName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World Mr. Prashant HEHEHE  Not Again!!";
    }

    @GetMapping("/get")
    public String doGet() {
        return "I Got you Man !!!!";
    }

}
