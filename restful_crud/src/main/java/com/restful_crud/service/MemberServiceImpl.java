package com.restful_crud.service;

import com.restful_crud.dao.MemberDAO;
import com.restful_crud.model.Member;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    @Override
    public List<Member> findAll() {
        return memberDAO.findAll();
    }

    @Override
    public Member findById(int id) {
        return memberDAO.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        memberDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Member save(Member member) {
        return memberDAO.save(member);
    }

    @Override
    @Transactional
    public Member update(Member member){
        return memberDAO.update(member);
    }

    @Override
    public List<Member> findByFirstName(String firstName) {
        return memberDAO.findByFirstName(firstName);
    }
}
