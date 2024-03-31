class Calculator {
    void add(int a, int b) {
        System.out.println("Addition " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Product " + (a * b));
    }

    void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Main {

    public static void main(String args[]) {
        int a = 10; // Change the value of 'a' to a desired number
        int b = 5; // Change the value of 'b' to a desired number

        Calculator c = new Calculator();
        c.add(a, b);
        c.subtract(a, b);
        c.multiply(a, b);
        c.division(a, b);
    }
}
