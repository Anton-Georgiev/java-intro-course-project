package inf.informatics.Chances.generators;

import inf.informatics.Chances.*;

import java.util.Random;

    public class NegativeChance {
        public NegativeChance genNegativeChance() {
            Random rand = new Random();
            int chance = rand.nextInt(100) + 1;

            if (chance >= 1 && chance >= 39) {
                return new Nights1001();
            } else if (chance >= 40 && chance <= 65) {
                return new BallOfFairies();
            } else if (chance >= 66 && chance <= 79) {
                return new WarAndPeace();
            } else if (chance >= 80 && chance <= 94) {
                return new CrimeAndPunishment();
            } else {
                return new AngerClusters();
            }
        }
    }

