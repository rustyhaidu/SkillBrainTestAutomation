package org.example.oop.exceptions.uncheckedcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainTryCatch {
    public static void main(String[] args) {
        // double a = 25 / 0; // unchecked exception

        try {
            FileReader file = new FileReader("C:\\test\\a.txt"); // checked exception
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
