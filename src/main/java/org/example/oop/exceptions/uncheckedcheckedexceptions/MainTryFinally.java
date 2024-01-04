package org.example.oop.exceptions.uncheckedcheckedexceptions;

public class MainTryFinally {
    public static void main(String[] args) {
        // double a = 25 / 0; // unchecked exception

        try {
            // FileReader file = new FileReader("C:\\test\\a.txt"); -- checked exception
            // -- cannot use this without catch
            double a = 25 / 0; // runtime unchecked exception
        } finally {
            System.out.println("This code will always execute, " +
                    "regardless if the exception is thrown or not");
        }

    }
}
