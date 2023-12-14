package org.example.oop.overloading.car;

public class SportsCar extends Car{

    public SportsCar(String nume, String culoare, String marca){
        super(nume, culoare, marca);
    }

    @Override
    public void printDetails(String option1, String option2, String option3) { // am suprascris printDetails("", "", "")
        System.out.println("SUPRASCRIS: Numele masinii si culoarea si marca"
                + getNume() + " " + getCuloare() + " " + getMarca());
        super.printDetails("","",""); // putem apela si metoda din clasa parinte
    }

}
