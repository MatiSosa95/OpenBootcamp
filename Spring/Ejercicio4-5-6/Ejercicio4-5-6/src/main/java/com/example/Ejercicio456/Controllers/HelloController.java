package com.example.Ejercicio456.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
