package com.restful_crud.dao;

import com.restful_crud.model.Member;

import java.util.List;

public interface MemberDAO {

    Member save(Member newMember);

    List<Member> findAll();

    Member findById(int id);

    void deleteById(int id);

    Member update(Member member);

    List<Member> findByFirstName(String firstName);

}

