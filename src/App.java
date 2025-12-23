class Programmer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.setName("Suhas Nag");
        System.out.println("Our Programmer name is " + p1.getName());
    }
}
