package com.ashish.upgrad.Blog.model;

import javax.persistence.Id;

public class User
{
    @Id
    private Integer id;
    private String username;
    private String password;
    private String fullName;
    public User()
    {
     System.out.println("********Default Constructor*******");
    }
    public User(Integer id,String fullName,String username,String password)
    {
        this.id=id;
        this.fullName=fullName;
        this.username=username;
        this.password=password;
        System.out.println("********Parametrised Constructor*******");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
