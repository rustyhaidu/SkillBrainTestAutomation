package org.example;

import org.example.oop.Lasagna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumere {

    @Test
    public void isPrime(){
        int nr = 11;
        boolean result =  Main.isPrime(nr);
        Assertions.assertTrue(result);
    }

    @Test
    public void isNotPrime(){
        int nr = 8;
        boolean result =  Main.isPrime(nr);
        Assertions.assertFalse(result);
    }

    @Test
    public void testUnu() {
        Lasagna lasagna = new Lasagna();

        int rezultat = lasagna.returneazaUnu();
        assertEquals(rezultat, 1);
    }
}
