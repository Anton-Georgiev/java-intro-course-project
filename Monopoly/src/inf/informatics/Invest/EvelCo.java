package inf.informatics.Invest;

public class EvelCo extends Invest {
    public EvelCo(double investment){
        super(investment);
    }
    @Override
    public String getName() {
        return "Evel Co";
    }

    @Override
    public double getMinInvestValue() {
        return 500;
    }

    @Override
    public double getCoefficient() {
        return 0.2;
    }

    @Override
    public int[] getRisk() {
        return new int[] {-5, 100};
    }

}
