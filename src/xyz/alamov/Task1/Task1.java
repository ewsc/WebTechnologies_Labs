package xyz.alamov.Task1;

public class Task1 {
    public static double calc(double x, double y) {
        double a = (1 + Math.sin(x + y) * Math.sin(x + y));
        double b = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));
        return a / b + x;
    }
}
