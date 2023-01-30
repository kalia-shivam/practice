package com.sampleproject.interview.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    //@PreAuthorize("permitAll()")
    @GetMapping("/example")
    public String example() {
        return "Hello, World!";
    }
}
