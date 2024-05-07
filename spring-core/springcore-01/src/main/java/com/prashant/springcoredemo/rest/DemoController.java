package com.prashant.springcoredemo.rest;

import com.prashant.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;


//  <-----      Constructor Injecion    ------>



//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }


    // <------    Setter Injection   ------->

    @Autowired
    public void setCoach(@Qualifier("killme") Coach theCoach) {
        myCoach = theCoach;
    }

    // Get our init method


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();

    }

    // for making sure of the prototype scope

//    @GetMapping("/check")
//    public String Check() {
//        return "the two variables point to different refenrences  :" + (myCoach == anotherCoach);
//    }


}
