package com.pos.registration.demo.helloworld;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {


    @GetMapping( path = "/world")
    public String helloWorld(){
        return  "Hello world";
    }
    @GetMapping( path = "/world-bean")
    public HelloWorldBean helloWorldBean(){
       // throw new RuntimeException("Error has happened");
       return  new HelloWorldBean("Hello world changed");
    }
    @GetMapping( path = "/world-/path-variable/{name}")
    public  HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return  new HelloWorldBean(String.format("welcome to Tracom services limited, our vision is to be the leading company in software and hardware production , %s", name));
    }
}
