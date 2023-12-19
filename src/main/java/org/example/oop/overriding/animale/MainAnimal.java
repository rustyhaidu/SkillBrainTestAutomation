package org.example.oop.overriding.animale;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.respira();

        Caine caine = new Caine();
        caine.respiraMetodaAnterioara();
        caine.respira();

        int numar = 60;

        String mesaj = numar > 60 ? "Numarul nostru e mai de 60" : "Numarul este mai mic";

        System.out.println(mesaj);
    }
}
