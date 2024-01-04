package org.example.oop.exceptions.customexceptions;

public class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Person is not age to vote");
        else
            System.out.println("welcome to vote");
    }
}
