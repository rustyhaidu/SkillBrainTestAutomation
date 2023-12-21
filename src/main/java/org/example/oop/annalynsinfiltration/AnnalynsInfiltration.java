package org.example.oop.annalynsinfiltration;

public class AnnalynsInfiltration {
    public boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return  !knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent;

        //return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}
