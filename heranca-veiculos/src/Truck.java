public class Truck extends Vehicle{

    private final double supportedLoad;

    public Truck(int passengers, double fuelCap, double mpg, double supportedLoad) {
        super(passengers, fuelCap, mpg);
        this.supportedLoad = supportedLoad;
    }

    public double getSupportedLoad() {
        return supportedLoad;
    }

    @Override
    public void move() {
        System.out.println("Caminhão Andando!");
    }


}
