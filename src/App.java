public class App {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Blue", 26.56, 15.33);
        System.out.println(rect.toString());
        Circle circ = new Circle("Red", 26.56);
        System.out.println(circ.toString());
    }
}
