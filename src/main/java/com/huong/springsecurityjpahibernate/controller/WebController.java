package com.huong.springsecurityjpahibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @GetMapping(value = {"/","/home"})
    public String homePage(){
        return "home";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
