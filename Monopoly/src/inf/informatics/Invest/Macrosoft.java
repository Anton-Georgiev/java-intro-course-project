package inf.informatics.Invest;

public class Macrosoft extends Invest {
    public Macrosoft(double investment){
        super(investment);
    }

    @Override
    public String getName() {
        return "Macrosoft";
    }

    @Override
    public double getMinInvestValue() {
        return 50;
    }

    @Override
    public double getCoefficient() {
        return 5.0;
    }

    @Override
    public int[] getRisk() {
        return new int[]{-20,10};
    }
}
