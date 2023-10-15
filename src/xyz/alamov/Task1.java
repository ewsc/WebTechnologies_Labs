package xyz.alamov;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input X: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Input Y: ");
        int y = scanner.nextInt();
        System.out.println("((1 + sin^2(" + x + " + " + y + ")) / (2 + |" + x + " - (2 * " + x + " / (1 + " + x + "^2 * " + y + "^2))|) + " + x + ")");
        double result = ((1 + Math.pow(Math.sin(x+y), 2)) / (2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))))) + x;
        System.out.println("Result = " + result);
    }
}
