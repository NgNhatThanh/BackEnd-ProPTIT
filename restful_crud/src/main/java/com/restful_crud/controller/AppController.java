package com.restful_crud.controller;

import com.restful_crud.model.Member;
import com.restful_crud.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AppController {

    MemberService memberService;

    @Autowired
    public AppController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member")
    public List<Member> getAll(){
        return memberService.findAll();
    }

    @GetMapping("/member/{memberId}")
    public Member getById(@PathVariable int memberId){
        return memberService.findById(memberId);
    }

    @GetMapping("/member/firstName={firstName}")
    public List<Member> getByFirstName(@PathVariable String firstName){
        return memberService.findByFirstName(firstName);
    }

    @PostMapping("/member")
    public Member addMember(@RequestBody Member member){
        return memberService.save(member);
    }

    @PutMapping("/member")
    public Member updateMember(@RequestBody Member member){
        return memberService.update(member);
    }

    @DeleteMapping("/member/{memberId}")
    public void deleteMemberbyID(@PathVariable int memberId){
        memberService.deleteById(memberId);
    }

}
