package Car_sim;

public class Benz extends Car {
    @Override
    public double getZeroToHundred() {
        return 8;
    }

    @Override
    public double getCurrentFuelEconomy() {
        return 200 / getCurrentSpeed();
    }
}