package Car_sim;

public class BMW extends Car {
    @Override
    public double getZeroToHundred() {
        return 5;
    }

    @Override
    public double getCurrentFuelEconomy() {
        return 100 / getCurrentSpeed();
    }
}