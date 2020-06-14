package inf.informatics.Invest;

public class FatCat extends Invest {
    public FatCat(double investment){
        super(investment);
    }

    @Override
    public String getName() {
        return "Fat Cat Inc.";
    }

    @Override
    public double getMinInvestValue() {
        return 100;
    }

    @Override
    public double getCoefficient() {
        return 2.5;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-25,100};
    }

}
