package org.example.member.service;

import jakarta.annotation.Resource;
import org.example.member.domain.Member;
import org.example.member.mapper.MemberMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Resource
    private MemberMapper memberMapper;

    public  int count(){
        return (int) memberMapper.countByExample(null);
    }

    public long register(String mobile){
        memberMapper.selectByExample();
        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        return memberMapper.insert(member);
    }
}
