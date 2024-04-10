package org.example.member.controller;

import jakarta.annotation.Resource;
import org.example.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;
    @GetMapping("/count")
    public Integer count(){
        return memberService.count();
    }
}
