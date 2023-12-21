package org.example.oop.lasgna;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        //return Math.max(0, expectedMinutesInOven() - actualMinutes);

       /* if(actualMinutes >=expectedMinutesInOven()){
            return 0;
        } else {
            return expectedMinutesInOven() - actualMinutes;
        }*/

        return actualMinutes >= expectedMinutesInOven() ? 0 : expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeMinutes(int layers, int minutes) {
        int preparationMinutes = preparationTimeInMinutes(layers);
        int remainingMinutes = remainingMinutesInOven(minutes);
        return preparationMinutes + remainingMinutes;
    }

}
