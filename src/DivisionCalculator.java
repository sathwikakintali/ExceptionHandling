import java.util.Scanner;

public class DivisionCalculator {
    public static void performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        // Perform division
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    public static void calculate(int numerator, int denominator) {
        try {
            performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            // Rethrow the exception with additional context
            throw new ArithmeticException("Error calculating division: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int numerator = 100;
        int denominator = 0;

        try {
            calculate(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
