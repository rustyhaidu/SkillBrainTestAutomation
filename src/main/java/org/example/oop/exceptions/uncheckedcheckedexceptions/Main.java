package org.example.oop.exceptions.uncheckedcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // double a = 25 / 0; // unchecked exception

        FileReader file = new FileReader("C:\\test\\a.txt"); // checked exception

        System.out.println("This will not be printed");
    }
}
