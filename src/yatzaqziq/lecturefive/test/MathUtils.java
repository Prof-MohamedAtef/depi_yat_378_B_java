package yatzaqziq.lecturefive.test;

public class MathUtils {
    // Static method to calculate factorial of a number
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Static method to calculate power of a number
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
