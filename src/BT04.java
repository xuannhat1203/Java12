class Shape {
    public double area() {
        return 0;
    }
}
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
public class BT04 {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println(s.area());
        Shape c = new Rectangle(5,5);
        System.out.println(c.area());
    }
}
