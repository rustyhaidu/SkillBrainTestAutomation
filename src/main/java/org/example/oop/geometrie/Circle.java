package org.example.oop.geometrie;

public class Circle extends Shape{
    @Override
    public void draw() {  // suprascriere
        System.out.println("Draw Circle");
    }

    public void draw(int paramExtra){
        System.out.println("Draw with Extra number " + paramExtra);
    }
}
