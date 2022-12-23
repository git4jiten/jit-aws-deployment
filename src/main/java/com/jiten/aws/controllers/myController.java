package com.jiten.aws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/display")
public class myController {

    @GetMapping
    public String display(){
        return "I am Jitendra.";
    }
}
