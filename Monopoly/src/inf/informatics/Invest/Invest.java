package inf.informatics.Invest;

import java.util.Random;

public abstract class Invest {
    public abstract String getName();
    public abstract double getMinInvestValue();
    public abstract double getCoefficient();
    public abstract int[] getRisk();

    double investment;

    public Invest(double investment){
        this.investment = investment;
    }
    public void setInvestment(double investment){
        this.investment = investment;
    }

    public double getInvestment(){
        return investment;
    }

    public double risk() {
        Random rand = new Random();
        int[] risk = getRisk();

        int chance = rand.nextInt(risk[1] - risk[0]);
        chance -= risk[0];

        if (chance >= 0) {
            return investment * getCoefficient();
        }
        else{
            return -(investment * getCoefficient());
        }
    }
}

