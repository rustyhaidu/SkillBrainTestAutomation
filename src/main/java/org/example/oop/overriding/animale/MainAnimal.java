package org.example.oop.overriding.animale;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.respira();

        Caine caine = new Caine();
        caine.respiraMetodaAnterioara();
        caine.respira();
    }
}
