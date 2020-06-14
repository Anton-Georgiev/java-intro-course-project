package inf.informatics.Invest;

public class ClockWorkOrange extends Invest {
    public ClockWorkOrange(double investment){
        super(investment);
    }
    @Override
    public String getName() {
        return "Clock Work Orange";
    }

    @Override
    public double getCoefficient() {
        return 1.5;
    }

    @Override
    public int[] getRisk() {
        return new int[] {-15,35};
    }

    @Override
    public double getMinInvestValue() {
        return 300;
    }
}
