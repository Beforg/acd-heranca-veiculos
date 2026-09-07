/**
 *  Classe Abstrata que representa um veículo.
 * @author Bruno Forgiarini
 */

public abstract class Vehicle {
    private final int passengers;
    private  final double fuelCap;
    private final double mpg;

    public Vehicle(int passengers, double fuelCap, double mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public double getMpg() {
        return mpg;
    }

    public abstract void move();

    @Override
    public String toString() {
        return String.format("Pessengers: %s\nFuel Capacity: %.2f\n" +
                " miles per gallon: %.2f", passengers, fuelCap, mpg);
    }
}
