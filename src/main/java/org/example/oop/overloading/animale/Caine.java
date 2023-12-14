package org.example.oop.overloading.animale;

public class Caine extends Animal {

    @Override
    public void respira() {
        System.out.println("Cainele Respira");
    }

    public void respiraMetodaAnterioara(){
        super.respira();
    }


}
