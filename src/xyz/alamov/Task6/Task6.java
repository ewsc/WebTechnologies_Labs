package xyz.alamov.Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double[] arraychik = fillArray(inputSize());
        System.out.println(Arrays.deepToString(escapeMatrix(arraychik)));
    }

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

    public static double[][] escapeMatrix(double[] mas){
        double[][] testingMatrix = new double[mas.length][mas.length];
        for (int i = 0; i < mas.length; i++) {
            int localCounter = 0;
            for (int j = i; j < mas.length; j++){
                System.out.print(mas[j] + " ");
                testingMatrix[i][localCounter] = mas[j];
                localCounter++;
            }
            for (int k = 0; k < i; k++){
                System.out.print(mas[k] + " ");
                testingMatrix[i][localCounter] = mas[k];
                localCounter++;
            }
            System.out.println();
        }
        return testingMatrix;
    }
}
