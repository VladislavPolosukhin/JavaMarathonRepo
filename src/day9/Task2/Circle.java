package day9.Task2;

public class Circle extends Figures {
   private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.pow(radius,2) * Math.PI);
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}
