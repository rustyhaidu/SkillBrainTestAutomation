package org.example.oop.animals;

import java.util.Objects;

public class Dog extends Animal implements MyInterface, MyInterface2 {
    private String name;
    private int age;
    private String breed;
    public static int membre = 4;

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(){

    }

    public String getName(){
        return name;
    }

    public static int getStaticMembre(){
        return membre;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void happyBirthday(){
        age++;
    }

    public void bark(){
        System.out.printf("%s is barking", name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void printSomething() {
        System.out.println("method implemented because Dog extends abstract class animal");
    }

    @Override
    public void printSomethingFromInterface() {
        System.out.println("method implemented because Dog implements abstract method from interface MyInterface");
    }
}
