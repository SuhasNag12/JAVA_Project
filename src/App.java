public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp(48);
        car.changeGear(3);
        System.out.println(car.toString());
        Bike bike = new Bike();
        bike.speedUp(88);
        bike.changeGear(5);
        System.out.println(bike.toString());
    }
}
