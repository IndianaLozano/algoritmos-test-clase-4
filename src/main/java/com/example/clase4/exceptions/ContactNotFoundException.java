package com.example.clase4.exceptions;

public class ContactNotFoundException extends RuntimeException {

    public ContactNotFoundException(String message) {
        super(buildMessage(message));
    }

    private static String buildMessage(String message) {
        return message;
    }

}
