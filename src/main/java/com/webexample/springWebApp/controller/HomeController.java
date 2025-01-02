package com.webexample.springWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello this is Home Page!!!";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return  "This is to check new page with /about ";
    }
}
