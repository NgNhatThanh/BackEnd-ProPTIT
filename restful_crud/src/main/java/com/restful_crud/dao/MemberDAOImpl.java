package com.restful_crud.dao;

import com.restful_crud.model.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    EntityManager entityManager;

    @Autowired
    public MemberDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public Member save(Member newMember) {
            entityManager.persist(newMember);
            return newMember;
    }

    @Override
    public List<Member> findAll() {
        TypedQuery<Member> query = entityManager.createQuery("FROM Member", Member.class);
        return query.getResultList();
    }

    @Override
    public Member findById(int id) {
        return entityManager.find(Member.class, id);
    }

    @Override
    public void deleteById(int id) {
        Member member = entityManager.find(Member.class, id);
        entityManager.remove(member);
    }

    @Override
    public Member update(Member member){
        return entityManager.merge(member);
    }

    @Override
    public List<Member> findByFirstName(String firstName) {
        TypedQuery<Member> query = entityManager.createQuery("select m from Member m where m.fullName like :firstName", Member.class);
        query.setParameter("firstName", "%" + firstName + "%");
        return query.getResultList();
    }

}
