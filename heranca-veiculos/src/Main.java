/**
 * @author bruno-forgiarini
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
       Vehicle t1 = new Truck(4,150.0, 20.0, 120.54);
        System.out.println("Truck: " + t1 + "\n\n");
        Vehicle offroad = new OffRoad(4,69.34,23.54,4.54);
        System.out.println("OffRoad: " + offroad);
        Thread.sleep(2000);
        t1.move();
        offroad.move();
    }
}
