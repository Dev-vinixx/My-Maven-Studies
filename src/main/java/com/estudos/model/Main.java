package com.estudos.model;

import com.estudos.model.authenticator.Authenticator;
import com.estudos.model.exception.EmailNotFound;
import com.estudos.model.exception.IncorrectPassword;
import com.estudos.model.exception.UserNotFound;

public class Main {
    public static void main(String[] args) {

        Authenticator authenticator = new Authenticator();

        authenticator.createAccount("Vinicius Santos", "vinixx", "viniciusjunior00005@gmail.com");
        authenticator.createAccount("João Pedro", "joaozinho00", "joaogamer0323177@gmail.com");

        try {
            authenticator.authenticatingAccount("João Pedro", "joaozinho00", "joaogamer0323177@gmail.com");
            authenticator.authenticatingAccount("Vinicius Santos", "vinixx", "viniciusjunior00005@gmail.com");
            authenticator.authenticatingAccount("Julia Nadia", "julia11", "julianadia@gmail.com");
        } catch (UserNotFound | IncorrectPassword | EmailNotFound e) {
            System.out.println("Error logging in: " + e.getMessage());
        }
    }
}
