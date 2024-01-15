package com.estudos.model.exception;

public class EmailNotFound extends Exception {

    public EmailNotFound() {
        super("Error: This email not found");
    }
}
