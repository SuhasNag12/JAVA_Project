public class Car extends Vehicle {

    int maxSpeed = 195;

    Car() {
        super();
        System.out.println("This is from Car Class Constructor.");
    }

    @Override
    void print() {
        super.print();
        System.out.println("This is from Car Class.");
        System.out.println("This is from Car Class, maxSpeed is: " + maxSpeed);
        System.out.println("This is from Car Class, maxSpeed from Vehicle class is: " + super.maxSpeed);
    }
}
