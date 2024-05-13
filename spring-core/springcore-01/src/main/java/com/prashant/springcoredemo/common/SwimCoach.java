package com.prashant.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim across the panama canal and come back 2 times !!!";
    }
}
