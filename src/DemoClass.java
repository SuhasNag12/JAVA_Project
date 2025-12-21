public class DemoClass {
    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }

    static void get() {
        System.out.println("The Software is: " + name);
        System.out.println("The Price of the Software is: " + price);
    }
}
