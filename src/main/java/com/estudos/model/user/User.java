package com.estudos.model.user;

public class User {
    private String name;
    private String password;
    private String email;

    public User(String name,String password, String email) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
