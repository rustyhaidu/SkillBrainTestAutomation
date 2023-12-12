package org.example.oop.animals;

import org.example.Bird;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainDog {

    public static void main(String[] args) {

        Dog caine1; // nedefinit
        caine1 = new Dog("Grivei", 6, "Pomeranian"); // instanta 1
        Dog dog2 = new Dog("Grivei", 3, "Buldog"); // instanta 1
        Dog caine3 = new Dog(); // instanta 1

        Dog dog4 = null; // nu are valoare // instanta 4

        // dog1.setName("Azorel");
        System.out.println(caine1.getName());

        System.out.println(caine1);
        System.out.println(dog2);

        /*String s1 = "ana";
        String s2 = "mana";*/
        //System.out.println("Obiectele sunt la fel? " + dog1.equals(dog2));
        System.out.println("Obiectele sunt la fel? " + caine1.equals(dog2));

        /*System.out.println(dog2.hashCode());
        System.out.println(dog1.hashCode());*/

        System.out.println(Dog.getStaticMembre()); // nu avem nevoie de instanta
        System.out.println(Dog.getStaticMembre());

        Dog.membre = 3;

        System.out.println(Dog.getStaticMembre());

        caine1.setSleeping(true);
        System.out.println(caine1.isSleeping());

        // Animal animal = new Animal();
        // animal.isEating = true;
        caine1.isEating = false;

        Bird bird = new Bird();
        bird.isEating = false; // am access pentru isEating e protected
        // bird.isMoving = true; -- nu e accesibil
        // bird.isMoving = true; -- nu e accesibil pentru isMoving e default

        // animal.isMoving = true;
        caine1.isMoving = true;
        // bird.isMoving = false  -- nu e accesibil

        MyInterface myInterface = new Dog(); // daca Dog implementeaza MyInterface,instanta lui este automat un obiect de tipul MyInterface

        List<String> list = new ArrayList<>();  //
        list = new LinkedList<>();
    }
}
