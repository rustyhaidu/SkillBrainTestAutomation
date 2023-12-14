package org.example.oop.overriding.animale;

public class Caine extends Animal {

    @Override
    public void respira() {
        System.out.println("Cainele Respira");
    }

    public void respiraMetodaAnterioara(){
        super.respira();
    }


}
