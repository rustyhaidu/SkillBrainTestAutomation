package org.example.oop.exceptions.customexceptions;

import static org.example.oop.exceptions.customexceptions.TestCustomException1.validate;

public class Main {
    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception m) {
            // System.out.println("Exception occured: " + m);
            m.printStackTrace();
        }

        System.out.println("rest of the code...");
    }

}
