package inf.informatics.Invest;

public class BombsAway extends Invest {
    public BombsAway(double investment){
        super(investment);
    }
    @Override
    public String getName() {
        return "Bombs Away";
    }
    @Override
    public double getCoefficient() {
        return 0.5;
    }
    @Override
    public int[] getRisk() {
        return new int[]{-10,50};
    }
    @Override
    public double getMinInvestValue() {
        return 300;
    }
}
