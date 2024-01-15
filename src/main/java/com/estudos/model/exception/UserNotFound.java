package com.estudos.model.exception;

public class UserNotFound extends Exception{

    public UserNotFound() {
        super("Error: This user not found");
    }
}
