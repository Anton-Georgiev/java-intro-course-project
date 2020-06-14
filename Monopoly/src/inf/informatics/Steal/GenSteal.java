package inf.informatics.Steal;

import java.util.Random;

public class GenSteal {
    public Steal genSteal() {
        Random rand = new Random();
        int random = rand.nextInt(3) + 1;

        if (random == 0) {
            return new ConquerTheWorld();
        } else if (random == 1) {
            return new Hostages();
        } else {
            return new BankRobbery();
        }
    }
}
