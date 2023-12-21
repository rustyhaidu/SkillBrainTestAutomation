package org.example.vendingmachine;

import org.example.oop.vendingmachine.Snack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnackTest {

    @Test
    public void snackTestPositive(){
        Snack snack = new Snack(5,"mar", 2);
        snack.scadeCantitate();

        Assertions.assertEquals(1, snack.getCantitate());
    }

    @Test
    public void snackTestNegative(){
        Snack snack = new Snack(5,"mar", 0);
        snack.scadeCantitate();

        Assertions.assertEquals(0, snack.getCantitate());
    }
}
