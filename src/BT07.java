class Vehicle {
    public void move(){
        System.out.println("Vehicle moving");
    };
    public void sound(){
        System.out.println("Vehicle sound");
    };
}
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Di chuyển nhanh");
    }
    @Override
    public void sound() {
        System.out.println("Vroom Vroom...");
    }
}
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Di chuyển chậm");
    }
    @Override
    public void sound() {
        System.out.println("Ring Ring...");
    }
}
class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Di chuyển với tốc độ trung bình");
    }
    @Override
    public void sound() {
        System.out.println("Honk Honk...");
    }
}
public class BT07 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Bus(),
        };
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
            vehicles[i].sound();
        }
    }
}
