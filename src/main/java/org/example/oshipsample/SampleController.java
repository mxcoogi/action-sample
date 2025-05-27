package org.example.oshipsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
