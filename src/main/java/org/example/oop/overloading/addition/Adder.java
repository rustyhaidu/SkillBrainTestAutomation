package org.example.oop.overloading.addition;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) { // overloading
        return a + b + c;
    }

    public String add(String a, String b) {
        int value1 = Integer.parseInt(a); // transformare in numar intreg
        int value2 = Integer.parseInt(b); // transformare in numar intreg
        int rez = value1 + value2;

        return String.valueOf(rez);
        // return rez + ""; // transformare in String
    }

    public double add(String a, double b) {
        double value1 = Double.parseDouble(a); // transformare in numar cu virgula
        return value1 + b;
    }
}
