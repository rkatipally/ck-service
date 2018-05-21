package net.ck.ckservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Code Karma From Priya & Raj !!";
    }
}
