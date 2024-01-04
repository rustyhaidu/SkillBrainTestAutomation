package org.example.oop.exceptions.uncheckedcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainArray {
    public static void main(String[] args) throws FileNotFoundException {
        int[] array = new int[]{1, 2, 3, 5};
        System.out.println(array[4]); // unchecked exception, index out of bounds exception
    }
}
