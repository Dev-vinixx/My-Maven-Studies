package com.estudos.model.authenticator;

import com.estudos.model.exception.EmailNotFound;
import com.estudos.model.exception.IncorrectPassword;
import com.estudos.model.exception.UserNotFound;
import com.estudos.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class Authenticator {
    private List<User> users = new ArrayList<>();

    public void createAccount(String name, String password, String email) {
        User newUser = new User(name, password, email);
        users.add(newUser);
        System.out.println("Account created with success");
    }

    public void authenticatingAccount(String name, String password, String email) throws UserNotFound, EmailNotFound, IncorrectPassword {
        User user = users.stream()
                .filter(u -> u.getName().equals(name))
                .findFirst()
                .orElseThrow(UserNotFound::new);

        if(!user.getPassword().equals(password)) {
            throw new IncorrectPassword();
        }
          users.stream()
                .filter(u -> u.getPassword().equals(password))
                .findFirst()
                .orElseThrow(EmailNotFound::new);

        System.out.println("Successful login for the user: " + name);
    }

}