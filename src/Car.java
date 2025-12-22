public class Car implements Vehicle {

    int speed;
    int gear;

    @Override
    public void speedUp(int speed) {
        this.speed = speed;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void applyBrake() {
        System.out.println("Bike slowed down.");
    }

    public String toString() {
        return "Car was speeding of " + speed + "Km/h in the gear: " + gear;
    }
}
