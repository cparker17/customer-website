package com.parker.customerwebsite.exceptions;

public class DuplicateBookException extends Exception {
    public DuplicateBookException(String message) {
        super(message);
    }
}