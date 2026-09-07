public class OffRoad extends Vehicle {
    private final double groundClearance;

    public OffRoad(int passengers, double fuelCap, double mpg, double groundClearance) {
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    @Override
    public void move() {
        System.out.println("OffRoad is moving!!");
    }


}
