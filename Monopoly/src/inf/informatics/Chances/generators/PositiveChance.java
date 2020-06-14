package inf.informatics.Chances.generators;
import inf.informatics.Chances.*;
import java.util.Random;

public class PositiveChance {
    public PositiveChance genPositiveChance() {
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;

        if (chance >= 1 && chance >= 39) {
            return new TheBigHopes();
        } else if (chance >= 40 && chance <= 65) {
            return new Lolita();
        } else if (chance >= 66 && chance <= 79) {
            return new PrideAndPrejudice();
        } else if (chance >= 80 && chance <= 94) {
            return new TheLordOfFlies();
        } else {
            return new Hobbit();
        }
    }
}
