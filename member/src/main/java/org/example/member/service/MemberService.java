package org.example.member.service;

import jakarta.annotation.Resource;
import org.example.member.mapper.MemberMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Resource
    private MemberMapper memberMapper;

    public  int count(){
        return memberMapper.count();
    }
}
