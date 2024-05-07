package com.prashant.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements  Coach{

    public TennisCoach() {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Smashing for 2 hrs Straight";
    }
}
