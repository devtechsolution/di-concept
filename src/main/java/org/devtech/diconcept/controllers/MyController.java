package org.devtech.diconcept.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "MyController: hello()";
    }
}
