package com.security.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerDemo {

    @GetMapping("/")
    public @ResponseBody String getHello(){
        return "HelloWorld";
    }

    @GetMapping("/hello")
    public @ResponseBody String getHelloWorld(){
        return "HelloWorld";
    }
}
