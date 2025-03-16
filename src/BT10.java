abstract class PaymentMethod {
    double amount;
    public PaymentMethod(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public abstract double processPayment(double amount);
    public abstract void processPayment(String currency);
    public abstract double calculateFee();
}
class CreditCard extends PaymentMethod {
    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return amount * 0.02;
    }
    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }
    @Override
    public void processPayment(String currency) {
        System.out.println(amount + " " + currency);
    }
}

class DebitCard extends PaymentMethod {
    public DebitCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return amount * 0.01;
    }
    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }
    @Override
    public void processPayment(String currency) {
        System.out.println(amount + " " + currency);
    }
}
class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return 0;
    }
    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }
    @Override
    public void processPayment(String currency) {
        System.out.println(amount + " " + currency);
    }
}
public class BT10 {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000);
        PaymentMethod debitCard = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);
        System.out.println("--- Credit Card ---");
        System.out.println("Total Payment (CreditCard): " + creditCard.processPayment(1000));
        creditCard.processPayment("USD");
        System.out.println("----------------------------");
        System.out.println("--- Debit Card ---");
        System.out.println("Total Payment (DebitCard): " + debitCard.processPayment(1000));
        debitCard.processPayment("EUR");
        System.out.println("----------------------------");
        System.out.println("--- Cash ---");
        System.out.println("Total Payment (Cash): " + cash.processPayment(1000));
        cash.processPayment("JPY");
    }
}
