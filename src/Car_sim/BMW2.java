package Car_sim;

public class BMW2 extends BMW{
    @Override
    public double getZeroToHundred() {
        return super.getZeroToHundred()*0.5;
    }

    @Override
    public double getCurrentFuelEconomy() {
        return super.getCurrentFuelEconomy() * 2;
    }
}
