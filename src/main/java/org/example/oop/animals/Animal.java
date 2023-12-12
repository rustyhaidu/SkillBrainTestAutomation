package org.example.oop.animals;

public abstract class Animal {
    private boolean isSleeping;
    protected boolean isEating;

    boolean isMoving;

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean eating) {
        isEating = eating;
    }

    public abstract void printSomething();
}
