class Person {
    String name;
    int age;

    Person() {
        System.out.println("This is a default constructor.");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is a Parameterized Constructor,\nName: " + name + "\nAge: " + age);
    }

    Person(Person obj2) {
        name = obj2.name;
        age = obj2.age;
        System.out.println("This is a Copy Constructor,\nName: " + name + "\nAge: " + age);
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Suhas Nag", 30);
        Person person3 = new Person(person2);
    }
}
