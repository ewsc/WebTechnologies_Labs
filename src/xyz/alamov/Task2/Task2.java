package xyz.alamov.Task2;

import java.util.Scanner;

public class Task2 {
    public static int returnInput(char letter) {
        System.out.print("Input " + letter + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
       int x = returnInput('X');
       int y = returnInput('Y');
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
