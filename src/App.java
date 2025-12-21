class Person {
    String name;
    int age;

    private Person() {
        System.out.println("This is from Private Constructor");
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(); // This will give error, since Private Constructor is called from a different
                                       // class

    }
}
