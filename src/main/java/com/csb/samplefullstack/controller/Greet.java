package com.csb.samplefullstack.controller;

import com.csb.samplefullstack.computations.Computation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world" + Computation.sumOfTwoNums();
    }

    @RequestMapping("/hi")
    public String hi(){
        return "hi world";
    }
}
