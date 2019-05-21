package kr.co.snsform.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/index")
    public String test(){

        return "Hello, World";
    }
}
