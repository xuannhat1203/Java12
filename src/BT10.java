abstract class PaymentMethod {
    double amount;
    String currency;
    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    abstract double processPayment();
    abstract double calculateFee();
    abstract void processPayment(double amount, String currency);
}

class CreditCard extends PaymentMethod {
    public CreditCard(double amount, String currency) {
        super(amount, currency);
    }
    @Override
    double calculateFee() {
        return amount * 0.02;
    }
    @Override
    double processPayment() {
        return amount + calculateFee();
    }
    @Override
    void processPayment(double amount, String currency) {
        double totalAmount = amount + calculateFee();
        System.out.println("----------" + "Credit Card" + "----------");
        System.out.println("Total Amount: " + processPayment()+ " "+currency);
        System.out.println("Processed payment of " + amount + " " + currency + " with total: " + totalAmount + " " + currency);
    }
}

class DebitCard extends PaymentMethod {
    public DebitCard(double amount, String currency) {
        super(amount, currency);
    }
    @Override
    double calculateFee() {
        return amount * 0.01;
    }
    @Override
    double processPayment() {
        return amount + calculateFee();
    }
    @Override
    void processPayment(double amount, String currency) {
        double totalAmount = amount + calculateFee();
        System.out.println("----------" + "Debit Card" + "----------");
        System.out.println("Total Amount: " + processPayment()+ " "+currency);
        System.out.println("Processed payment of " + amount + " " + currency + " with total: " + totalAmount + " " + currency);
    }
}

class Cash extends PaymentMethod {
    public Cash(double amount, String currency) {
        super(amount, currency);
    }
    @Override
    double calculateFee() {
        return 0;
    }
    @Override
    double processPayment() {
        return amount;
    }
    @Override
    void processPayment(double amount, String currency) {
        double totalAmount = amount + calculateFee();
        System.out.println("----------" + "Cash" + "----------");
        System.out.println("Total Amount: " + processPayment()+ " "+currency);
        System.out.println("Processed payment of " + amount + " " + currency + " with total: " + totalAmount + " " + currency);
    }
}

public class BT10 {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = {
                new CreditCard(1000, "USD"),
                new DebitCard(1000, "EUR"),
                new Cash(1000, "JPY"),
        };

        for (int i = 0; i < paymentMethods.length; i++) {
            paymentMethods[i].processPayment(paymentMethods[i].amount,paymentMethods[i].currency);
        }
    }
}
