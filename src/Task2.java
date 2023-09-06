import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input X: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Input Y: ");
        int y = scanner.nextInt();
        boolean result = false;
        if (x >= 0 && y >= 0) {
            if (x <= 4 && y <= 5) {
                result = true;
            }
        }
        else if (x <= 0 && y >= 0) {
            if (x >= -4 && y <= 5) {
                result = true;
            }
        }
        else if (x >= 0 && y <= 0) {
            if (x <= 6 && y >= -3) {
                result = true;
            }
        }
        else if (x <= 0 && y <= 0) {
            if (x >= -6 && y >= -3) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
