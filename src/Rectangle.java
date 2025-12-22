public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle Constructor called.");
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
    @Override
    public String toString(){
        return "Rectangle Color is: " + super.getColor() + " and Area is: " + area();    }
}
