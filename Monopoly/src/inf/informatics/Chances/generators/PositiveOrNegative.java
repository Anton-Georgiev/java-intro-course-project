package inf.informatics.Chances.generators;

import inf.informatics.Chances.Chance;

import java.util.Random;

public class PositiveOrNegative {
    public Chance genChance() {
        Random rand = new Random();

        int chance = rand.nextInt(10)+1;
        if (chance % 2 == 0) {
            System.out.println("Positive Chance\n");
            PositiveChance positiveChance = new PositiveChance();
            return positiveChance.genPositiveChance();
        } else {
            System.out.println("Negative Chance\n");
            NegativeChance negativeChance = new NegativeChance();
            return negativeChance.genNegativeChance();
        }
    }
}

