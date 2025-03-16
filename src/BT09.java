abstract class Vehicle2 {
    public abstract void move();
    public abstract void sound();
    public void move(int time, int speed) {
        System.out.println("Khoang cach di chuyen: " + (time * speed));
    }
}

class Car2 extends Vehicle2 {
    @Override
    public void move() {
        System.out.println("Di chuyen tren mat dat");
    }
    @Override
    public void sound() {
        System.out.println("Vroom");
    }
}

class Bike2 extends Vehicle2 {
    @Override
    public void move() {
        System.out.println("Di chuyen voi toc do cham");
    }
    @Override
    public void sound() {
        System.out.println("Ring ring");
    }
}

class Bus2 extends Vehicle2 {
    @Override
    public void move() {
        System.out.println("Di chuyen tren mat dat");
    }
    @Override
    public void sound() {
        System.out.println("Honk");
    }
}

class Airplane extends Vehicle2 {
    @Override
    public void move() {
        System.out.println("Di chuyen tren khong");
    }
    @Override
    public void sound() {
        System.out.println("Whoosh");
    }
}

public class BT09 {
    public static void main(String[] args) {
        Vehicle2 car = new Car2();
        Vehicle2 bike = new Bike2();
        Vehicle2 bus = new Bus2();
        Vehicle2 airplane = new Airplane();
        car.move();
        car.sound();
        car.move(2, 60);
        bike.move();
        bike.sound();
        bike.move(1, 20);
        bus.move();
        bus.sound();
        bus.move(3, 40);
        airplane.move();
        airplane.sound();
        airplane.move(5, 800);
    }
}