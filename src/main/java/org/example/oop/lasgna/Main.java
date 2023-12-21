package org.example.oop.lasgna;

public class Main {
    public static void main(String[] args) {
        Lasagna lasagna1 = new Lasagna();
        System.out.println(lasagna1.expectedMinutesInOven());

        System.out.println(lasagna1.remainingMinutesInOven(40));
        System.out.println(lasagna1.totalTimeMinutes(3, 20));
    }
}
