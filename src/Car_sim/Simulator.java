package Car_sim;

public class Simulator {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String path = "Car_sim.";
        String arg0 = "Jaguar";
        Car theCar = (Car) Class.forName(path+arg0).newInstance();

        System.out.println("Car Model is " + arg0);

        for(int i=0; i<10; i++) {
            theCar.accelerateOneSecond();

            System.out.println(""+ i +  "sec. speed is " + theCar.getCurrentSpeed()
                    + " and the fuel economy is " + theCar.getCurrentFuelEconomy());
        }
    }
}
