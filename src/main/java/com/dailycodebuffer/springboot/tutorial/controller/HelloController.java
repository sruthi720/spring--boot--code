package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${Welcome.message}")
    public String welcomeMessage;

    @RequestMapping(value = "/" , method = RequestMethod.GET)//==>@getMapping("/")
    public String helloWorld(){
        return welcomeMessage;
    }
}
