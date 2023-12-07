package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void isCharacterPresent(){
        String sentence = "Ana are mere";
        boolean isPresent = Main.isCharacterPresent(sentence, 'a');
        Assertions.assertTrue(isPresent);
    }

    @Test
    public void isCharacterNotPresent(){
        String sentence = "Ana are mere";
        boolean isPresent = Main.isCharacterPresent(sentence, 'z');
        Assertions.assertFalse(isPresent);
    }

}