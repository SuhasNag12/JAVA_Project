interface Add {
    int add(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

class Calculate implements Add, Sub {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class App {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        int resultAdd = cal.add(54, 32);
        int resultSub = cal.sub(32, 8);
        System.out.println("Sum of two numbers: " + resultAdd + "\nSubtraction betwen two numbers: " + resultSub);
    }
}
