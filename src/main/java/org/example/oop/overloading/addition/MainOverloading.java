package org.example.oop.overloading.addition;

public class MainOverloading {
    public static void main(String[] text) {
        main();
        main("Exemplu");
    }

    public static void main(){
        System.out.println("Main-ul care nu primeste parametru");
    }

    public static void main(String text){
        System.out.println("Main-ul care primeste parametru String: " + text);
    }
}
