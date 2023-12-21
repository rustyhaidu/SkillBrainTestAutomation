package org.example.annalynsinfiltration;

import org.example.oop.annalynsinfiltration.AnnalynsInfiltration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnalynsInfiltrationTest {
    AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();

    @Test
    public void canPrisonerCanBeFreedPositive(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                true, false);

        Assertions.assertTrue(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative1(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                false, false);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative2(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                true, true);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative3(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                true, false,
                true, false);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative4(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, true,
                true, false);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative5(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, true,
                true, false);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative6(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, true,
                true, false);

        Assertions.assertFalse(actual);
    }

    @Test
    public void canPrisonerCanBeFreedNegative7(){
        boolean actual = annalynsInfiltration.canFreePrisoner(
                false, false,
                false, true);

        Assertions.assertFalse(actual);
    }
}
