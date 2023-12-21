package org.example.vendingmachine;

import org.example.oop.vendingmachine.Snack;
import org.example.oop.vendingmachine.VendingMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class VendingMachineTest {

    @Test
    public void testVendingMachineNegative1() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);
        /* Exception exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Snack snack = vendingMachine.getSnack(5, 5);
        });*/

        Exception exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Snack snack = vendingMachine.getSnack(5, 5);
            }
        });

        String expectedMessage = "Index 5 out of bounds for length 5";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testVendingMachinePositive1() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);
        vendingMachine.setSnackInVendingMachine(new Snack(5, "banana", 1), 1, 1);

        Snack snack = vendingMachine.getSnack(1, 1);
        // int initialSnackQuantity = snack.getCantitate();

        vendingMachine.getSnack(1,1);

        Assertions.assertEquals(0, snack.getCantitate());
    }

    @Test
    public void testVendingMachinePositive2() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);
        vendingMachine.setSnackInVendingMachine(new Snack(5, "banana", 1), // snack
                1, 1); // pe pozitia 1, 1

        Snack snack = vendingMachine.getSnack(1, 1);
        // int initialSnackQuantity = snack.getCantitate();

        vendingMachine.getSnack(1,1);

        Assertions.assertEquals("banana", snack.getNume());
    }

    @Test
    public void testVendingMachinePositive3() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);

        Assertions.assertEquals("Timisoara", vendingMachine.getLocatie());
    }

    @Test
    public void testVendingMachinePositive4() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);

        vendingMachine.cerereRest();
        Assertions.assertEquals(0, vendingMachine.getSold());
    }

    @Test
    public void testVendingMachinePositive5() {
        VendingMachine vendingMachine = new VendingMachine(0, "Timisoara", 5, 5);

        vendingMachine.cerereRest();
        Assertions.assertEquals(0, vendingMachine.getSold());
    }

    @Test
    public void testVendingMachineNegative2() { // de pus nume mai sugestive, ce se testeaza efectiv
        VendingMachine vendingMachine = new VendingMachine(3, "Timisoara", 5, 5);

        Snack snack = vendingMachine.getSnack(1, 1); // sa returneze null cu mesajul sold insuficient,
                                                            // sau sa arunce exceptie
        Assertions.assertNull(snack);
    }

    @Test
    public void testVendingMachineNegative3() { // de pus nume mai sugestive, ce se testeaza efectiv
        VendingMachine vendingMachine = new VendingMachine(3, "Timisoara", 5, 5);

        Snack snack = vendingMachine.getSnack(1, 1); // snack inexistent,
                                                            // sau sa arunce exceptie sau mesaj: "Nu exista snack-ul"
        Assertions.assertNull(snack);
    }
}
