package com.telusk.springweb.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeControler {


    @GetMapping("/")
    public String hello(){
        return "hello";
    }

}
