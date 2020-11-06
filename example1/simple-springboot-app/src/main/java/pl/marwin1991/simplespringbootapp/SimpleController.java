package pl.marwin1991.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping
    public String helloWorld(){
        return "Hello world :) CodeCool !!!";
    }
}
