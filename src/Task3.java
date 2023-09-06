import java.text.DecimalFormat;
import java.util.Scanner;

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

    public static void main(String[] args) {
        System.out.print("Input step size: ");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        System.out.print("Input amount of steps: ");
        int  amount = scanner.nextInt();
        System.out.println("||   x   ||    F(x)    ||");
        int x = 0;
        for (int i = 0; i < amount + 1; i++) {
            System.out.print("||" + fillWitSpaces(String.valueOf(x), 7) + "||");
            double func = Math.tan(x);
            DecimalFormat numberFormat = new DecimalFormat("0.0000");
            System.out.println("" + fillWitSpaces(numberFormat.format(func), 12) + "||");
            x = x + h;
        }
    }
}
