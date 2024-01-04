package org.example.oop.exceptions.uncheckedcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainTryCatchFinally {
    public static void main(String[] args) {
        // double a = 25 / 0; // unchecked exception

        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            System.out.println("This code will always execute, " +
                    "regardless if the exception is thrown or not");
        }

    }
}
