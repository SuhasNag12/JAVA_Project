class Animal {
    public void sound() {
        System.out.println("Animals makes sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class App {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();

    }
}