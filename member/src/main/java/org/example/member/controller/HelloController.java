package org.example.member.controller;

import jakarta.annotation.Resource;
import org.example.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String count(){
        return "hello";
    }
}
