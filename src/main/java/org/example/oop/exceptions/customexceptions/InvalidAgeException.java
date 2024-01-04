package org.example.oop.exceptions.customexceptions;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super("InvalidAgeException: " + s);
    }
}
