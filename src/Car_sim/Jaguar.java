package Car_sim;

public class Jaguar extends Car{
    @Override
    public double getZeroToHundred() {
        return 4;
    }

    @Override
    public double getCurrentFuelEconomy() {
        return 250/ getCurrentSpeed();
    }
}
