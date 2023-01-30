package com.sampleproject.interview.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    //@PreAuthorize("permitAll()")
    @GetMapping("/exampleGet")
    public String exampleGet() {
        return "Get Hello, World!";
    }

    //one message
    //@PreAuthorize("permitAll()")
    @PostMapping("/example")
    public String examplePost(@RequestBody String example) {
        return "Post Hello, World2!";
    }

    //delete
    @DeleteMapping("/exampleDelete")
    public String exampleDelete() {
        return "Delete Hello, World4!";
    }

    //@PreAuthorize("permitAll()")
    @PutMapping("/examplePut")
    public String examplePut(@RequestBody String example) {
        //hello world
        return "Put Hello, World2!";
    }

}
