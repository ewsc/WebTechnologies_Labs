package xyz.alamov.Task2;

import java.util.Scanner;

public class Task2 {
    public static int returnInput(char letter) {
        System.out.print("Input " + letter + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean getRegion(double x, double y) {
        if (x >= 0 && y >= 0) {
            if (x <= 4 && y <= 5) {
                return true;
            }
        }
        else if (x <= 0 && y >= 0) {
            if (x >= -4 && y <= 5) {
                return true;
            }
        }
        else if (x >= 0 && y <= 0) {
            if (x <= 6 && y >= -3) {
                return true;
            }
        }
        else if (x <= 0 && y <= 0) {
            if (x >= -6 && y >= -3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       double x = returnInput('X');
       double y = returnInput('Y');
       System.out.println(getRegion(x, y));
    }
}
