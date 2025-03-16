class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
public class BT03 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}
