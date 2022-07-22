package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("index")
    public  String helloWorld(){
        return  "hello World - SprigBoot";
    }

    @RequestMapping("/java")
    public  String helloJava(){
        return  "hello Java";
    }


    @RequestMapping("/haha")
    public  String haha(){
        return  "haha";
    }

}
