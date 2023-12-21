package org.example.oop.annalynsinfiltration;

public class MainAnnalynsInfiltration {
    public static void main(String[] args) {
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();

        System.out.println(annalynsInfiltration.canFastAttack(true));
        System.out.println(annalynsInfiltration.canSpy(true, false, false));

        System.out.println(annalynsInfiltration.canSignalPrisoner(false, true));
        /*System.out.println(annalynsInfiltration.canFreePrisoner(
                true,
                false,
                true,
                false));*/
    }
}
