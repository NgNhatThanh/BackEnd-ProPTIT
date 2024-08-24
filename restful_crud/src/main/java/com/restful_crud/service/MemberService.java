package com.restful_crud.service;

import com.restful_crud.model.Member;

import java.util.List;

public interface MemberService {

    Member save(Member newMember);

    List<Member> findAll();

    Member findById(int id);

    void deleteById(int id);

    Member update(Member member);

    List<Member> findByFirstName(String firstName);

}
