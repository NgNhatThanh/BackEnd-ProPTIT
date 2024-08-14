package com.spring_demo;

public class User {

    public String email;
    public String fullName;
    public int age;

    public User(String fullName, String email, int age){
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    public String toString(){
        return "User [fullName = " + fullName + ", email = " + email + " ]";
    }

}
