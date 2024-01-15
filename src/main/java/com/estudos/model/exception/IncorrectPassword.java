package com.estudos.model.exception;

public class IncorrectPassword extends Exception {

    public IncorrectPassword() {
        super("Error: This incorrect password");
    }
}
