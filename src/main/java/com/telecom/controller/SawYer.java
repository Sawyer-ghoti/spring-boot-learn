package com.telecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SawYer {
//    @GetMapping("/hello")
    public String showName(){
        return "李凌云";
    }

    @GetMapping("/")
    public String showName2(){
        return "李凌云11212";
    }
}
