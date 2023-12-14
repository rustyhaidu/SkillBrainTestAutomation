package org.example.oop.overloading.addition;

public class Main {
    public static void main(String[] args) {

        Adder adder = new Adder();

        //int result = adder.add(9,7, 8);

        //String resultString = adder.add("6", "5");
        double resultDouble = adder.add("6.8", 7.4);

        // System.out.println("Suma este: " + result);
        //System.out.println("Suma este: " + resultString);
        System.out.println("Suma este: " + resultDouble);
    }
}
