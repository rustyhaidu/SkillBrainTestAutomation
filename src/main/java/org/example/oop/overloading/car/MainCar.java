package org.example.oop.overloading.car;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Natasha");
        Car car2 = new Car();
        Car car3 = new Car("SuperSpeed", "rosie");

        System.out.println(car3.getNume() + " " + car3.getCuloare());

        Car car4 = new Car("Furia Rosie", "rosie", "Volkwagen");

        System.out.println(car4);

        car4.printDetails("","","");
        car4.printDetails("","");
        car4.printDetails("");

        SportsCar sportsCar = new SportsCar("Furia Albastra", "rosie", "Volkwagen");
        sportsCar.printDetails("");
        sportsCar.printDetails("","");
        sportsCar.printDetails("","", "");
    }
}
