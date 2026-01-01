/* Compile time poly means METHOD OVERLOADING */
class MathOperations {

    // method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println("Sum of 2 integers: " + m.add(10, 20));
        System.out.println("Sum of 3 integers: " + m.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + m.add(5.5, 6.5));
    }
}
