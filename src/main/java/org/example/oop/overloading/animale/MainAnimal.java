package org.example.oop.overloading.animale;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.respira();

        Caine caine = new Caine();
        caine.respiraMetodaAnterioara();
        caine.respira();
    }
}
