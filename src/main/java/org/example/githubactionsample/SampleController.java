package org.example.githubactionsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String ex1(){
        return "Hello";
    }
    @GetMapping("/d")
    public String ex2(){
        return "Hello";
    }
}
