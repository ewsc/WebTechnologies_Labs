package xyz.alamov.Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
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
            arraychik[i] = scanner.nextDouble();
        }
        System.out.println();
        return arraychik;
    }

    public static double[] sortYourTrash(double[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hhsort(array, h);
            h = h / 3;
        }
        return array;
    }

    private static void hhsort(double[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    private static void swap(double[] array, int j, int i) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String [] args){
        double[] arraychik = fillArray(inputSize());
        sortYourTrash(arraychik);
        System.out.println(Arrays.toString(arraychik));
    }
}
