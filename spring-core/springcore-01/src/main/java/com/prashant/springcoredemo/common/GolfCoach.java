package com.prashant.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// For changing the scope to prototype
//@Scope(
//        ConfigurableBeanFactory.SCOPE_PROTOTYPE
//)

// @Primary can also be used to resolve conflict between multiple dependencies
@Component
public class GolfCoach implements Coach{

    public GolfCoach() {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run A Hard 5k";
    }
}
