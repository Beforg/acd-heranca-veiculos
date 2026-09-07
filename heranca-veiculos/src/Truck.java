public class Truck extends Vehicle{

    private final double cargoCap;

    public Truck(int passengers, double fuelCap, double mpg, double supportedLoad) {
        super(passengers, fuelCap, mpg);
        this.cargoCap = supportedLoad;
    }

    public double getCargoCap() {
        return cargoCap;
    }

    @Override
    public void move() {
        System.out.println("Truck is moving!!");
    }

    @Override
    public String toString() {
        return super.toString() +  "Cargo Capacity:  " +  cargoCap;
    }
}
