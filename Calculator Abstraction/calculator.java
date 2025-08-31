public class calculator implements calculatornterface {
    private int a;
    private int b;

    // Constructor
    public calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int add() {
        return a + b;
    }

    @Override
    public int subtract() {
        return a - b;
    }

    @Override
    public int multiply() {
        return a * b;
    }

    @Override
    public int divide() {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    @Override
    public int modulo() {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed");
        }
        return a % b;
    }
}