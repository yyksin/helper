package com.yyk.hellper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelpController {

    @GetMapping("help")
    public String index(){
        return "hello help";
    }
}
