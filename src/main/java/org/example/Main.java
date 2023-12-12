package org.example;

import org.example.oop.animals.Dog;
import org.example.oop.animals.Lasagna;

public class Main {

    public Main(){

    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Lasagna obiect1 = new Lasagna();
        //obiect1.printNeStatic();

        //Lasagna.printStatic();

        obiect1.name = "Prima noastra Lasagna";
        System.out.println(obiect1.name);

        Lasagna obiect2 = new Lasagna();
        obiect2.name = "A doua noastra Lasagna";
        System.out.println(obiect2.name);

        // Animal animal = new Animal();
        //animal.isEating = true; // suntem in afara pachetului, nu avem access la isEating
        Dog caine1 = new Dog();
        //caine1.isEating = false; // suntem in afara pachetului, nu avem access la isEating

        Bird bird = new Bird();
        //bird.isEating = false; // suntem in afara pachetului, nu avem access la isEating

    }


    public static boolean isCharacterPresent(String sir, char caracterCautat) {
        boolean caracterExista = false;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == caracterCautat) {
                caracterExista = true;
                break;
            }
        }
        return caracterExista;

    }

    public static boolean isPrime(int nr) {
        return false;
    }
}