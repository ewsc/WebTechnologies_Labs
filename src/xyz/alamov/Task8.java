package xyz.alamov;

import java.util.Scanner;

public class Task8 {
    public static int inputSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        return scanner.nextInt();
    }

    public static double[] fillArray(int size) {
        double [] arraychik = new double[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < size; i++) {
            System.out.print("Input array's " + i + " element: ");
            arraychik[i] = scanner.nextInt();
        }
        System.out.println();
        return arraychik;
    }

    public static void printIndexes(double[] array_uno, double[] array_dos) {
        for (double v : array_dos)
            System.out.println(binarySearching(array_uno, 0, array_uno.length - 1, v));
    }

    public static double binarySearching(double[] arr, int leftBorder, int rightBorder, double sElem) {
        int m = -1;
        if (sElem <= arr[leftBorder])
            return leftBorder;
        if (sElem >= arr[rightBorder])
            return rightBorder;
        while (leftBorder <= rightBorder) {
            m = (leftBorder + rightBorder) / 2;
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                rightBorder = m - 1;
            if (sElem > arr[m])
                leftBorder = m + 1;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Input Array №1");
        double[] arraychik_one = fillArray(inputSize());
        System.out.println("Input Array №2");
        double[] arraychik_two = fillArray(inputSize());
        printIndexes(arraychik_one, arraychik_two);
    }

}
