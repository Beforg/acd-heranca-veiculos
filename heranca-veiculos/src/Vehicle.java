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
}
