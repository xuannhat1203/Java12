class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class BT02 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        Calculator calc = new Calculator();
        System.out.println(calc.add(a, b));;
        System.out.println(calc.add(a, b, c));
    }
}
