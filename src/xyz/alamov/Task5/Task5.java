package xyz.alamov.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arraychik = new int[n];
        for (int i = 0 ; i < n; i++) {
            System.out.print("Input array's " + i + " element: ");
            arraychik[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arraychik));
        System.out.println("Least number of elements, that have to be dropped to make sequence ascending: " + findLeastNumberOfElements(arraychik));
    }

    static int binarySearch(int[] arr, int l, int r, int sElem) {
        int m = -1;
        if (sElem < arr[l])
            return l;
        if (sElem > arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                r = m - 1;
            if (sElem > arr[m])
                l = m + 1;
        }
        return m;
    }

    public static int findLeastNumberOfElements(int[] mas) {
        boolean isSort = true;
        for (int i = 0; i < mas.length - 1 ; i++) {
            if(mas[i] > mas[i + 1]){
                isSort = false;
                break;
            }
        }
        if (isSort)
            return 0;
        int n = mas.length;
        int length = 0;
        final int MIN = -2147483648;
        final int MAX = 2147483647;
        int[] extraArray = new int[n];
        extraArray[0]=MIN;
        for (int i = 1; i < n; i++)
            extraArray[i] = MAX;
        for (int i = 0; i < n - 1; i++) {
            int j = binarySearch(extraArray,0,n-1,mas[i]);
            if (extraArray[j - 1] < mas[i] && mas[i] < extraArray[j]){
                extraArray[j] = mas[i];
                length = Math.max(length, j);
            }
        }
        return n-length;
    }
}
