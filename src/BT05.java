class Shape2 {
    public double area() {
        return 0.0;
    }
}
class Circle2 extends Shape2 {
    double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle2 extends Shape2 {
    double width;
    double height;
    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
class Square2 extends Shape2 {
    double side;
    public Square2(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}
public class BT05 {
    public static void main(String[] args) {
        Shape2[] shapes = {
                new Circle2(6),
                new Rectangle2(5,5),
                new Square2(5)
        };
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}
