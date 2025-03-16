class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getDiscount() {
        return 0;
    }
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5;
        }
        return getDiscount();
    }
    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }
    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        return price - (price * discount / 100);
    }
}
class Electronic extends Product {
    public Electronic(String name, double price) {
        super(name, price);
    }
    @Override
    public double getDiscount() {
        return 10;
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
    @Override
    public double getDiscount() {
        return 20;
    }
}
class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 5;
    }
}
public class BT08 {
    public static void main(String[] args) {
        Product[] products = {
                new Electronic("Laptop", 1000),
                new Clothing("Áo sơ mi", 500),
                new Food("Bánh mì", 50),
        };
        for (Product product : products) {
            System.out.println(product);
            System.out.println("Giá sau chiết khấu (mặc định): " + product.getFinalPrice());
            System.out.println("Giá sau chiết khấu khi mua " + 120 + " sản phẩm: " + product.getFinalPrice(120));
            System.out.println("----------------------");
        }
    }
}
