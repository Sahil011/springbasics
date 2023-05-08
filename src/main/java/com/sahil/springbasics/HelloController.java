package com.sahil.springbasics;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/you")
    @ResponseBody
    public String helloyou(@RequestParam (required = false)String name){
        return "Hello "+name;
    }

}
