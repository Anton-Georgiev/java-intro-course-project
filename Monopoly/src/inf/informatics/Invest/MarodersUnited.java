package inf.informatics.Invest;

public class MarodersUnited extends Invest {
    public MarodersUnited(double investment){
    super(investment);
    }

    @Override
    public String getName() {
        return "Maroders United";
    }

    @Override
    public double getCoefficient() {
        return 2;
    }

    @Override
    public double getMinInvestValue() {
        return 200;
    }

    @Override
    public int[] getRisk() {
        return new int[] {-18,50};
    }

}
