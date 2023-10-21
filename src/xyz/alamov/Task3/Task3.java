package xyz.alamov.Task3;

import java.text.DecimalFormat;

public class Task3 {
    public static String fillWitSpaces(String value, int maxLength) {
        int length = maxLength - value.length();
        StringBuilder returningThis = new StringBuilder();
        returningThis.append(" ".repeat(Math.max(0, length / 2)));
        returningThis.append(value);
        length = length - (length / 2);
        returningThis.append(" ".repeat(Math.max(0, length)));
        return returningThis.toString();
    }

    public static double returnFuncValue(double x) {
        return Math.tan(x);
    }

    public static void main(String[] args) {
        double a = -2;
        double b = 2;
        double h = 0.1;
        System.out.println("||     x      ||    F(x)    ||");
        for (double x = a; x <= b; x += h) {
            DecimalFormat numberFormat = new DecimalFormat("0.0000");
            System.out.print("||" + fillWitSpaces(numberFormat.format(x), 12) + "||");
            System.out.println("" + fillWitSpaces(numberFormat.format(returnFuncValue(x)), 12) + "||");
            x = x + h;
        }
    }
}
