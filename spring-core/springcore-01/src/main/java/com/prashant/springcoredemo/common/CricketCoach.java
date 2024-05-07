package com.prashant.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

//
//    @PostConstruct
//    public void doStartupStuff() {
//        System.out.println( "Yay i did startup stuff");
//    }
//
//    // Get our Destroy method
//    @PreDestroy
//    public void doDestrucionStuff() {
//        System.out.println( "yay i did destruction stuff");
//    }

    @Override
    public String getDailyWorkout() {
        return "Run Around the boundary in 10 minutes !";
    }
}
