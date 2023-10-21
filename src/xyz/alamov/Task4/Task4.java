package xyz.alamov.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static boolean checkForOptimusPrime(int value) {
        int i = 2;
        boolean result = true;
        while (i <= value / 2) {
            if (value % i == 0) {
                result = false;
                break;
            }
            ++i;
        }
        return result;
    }

    public static ArrayList<Integer> returnPositions(int[] arraychik) {
        ArrayList<Integer> lastPrimeOnCybertron = new ArrayList<>();
        for (int i = 0; i < arraychik.length; i++) {
            if (checkForOptimusPrime(arraychik[i])) {
                lastPrimeOnCybertron.add(i);
            }
        }
        return lastPrimeOnCybertron;
    }

    public static void main(String[] args) {
        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arraychik = new int[n];
        for (int i = 0; i < arraychik.length; i++) {
            System.out.print("Input array's " + i + " element: ");
            arraychik[i] = scanner.nextInt();
        }
        ArrayList<Integer> lastPrimeOnCybertron = returnPositions(arraychik);
        System.out.println("Your array: " + Arrays.toString(arraychik));
        if (lastPrimeOnCybertron.size() != 0) {
            System.out.print("Prime numbers in your array: [");
            for (Integer integer : lastPrimeOnCybertron) {
                System.out.print(" " + arraychik[integer] + " (index: " + integer + ")");
            }
            System.out.println(" ]");
        }
        else {
            System.out.println("No prime numbers found in your array!");
        }
    }
}
