import static java.lang.Math.*;

public class MathOperations {

    public static int add(int a, int b) {
        // Your code here
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        // Your code here
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        int num1 = 15;
        int num2 = 12;

        System.out.println("Add: " + add(num1, num2));
        System.out.println("Subtract: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2));
    }
}
