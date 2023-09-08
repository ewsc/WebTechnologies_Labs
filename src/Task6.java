import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double[] arraychik = fillArray(inputSize());
        escapeMatrix(arraychik);
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

    public static void escapeMatrix(double[] mas){
        for (int i = 0; i < mas.length ; i++) {
            for (int j = i; j < mas.length;j++){
                System.out.print(mas[j] + " ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(mas[k] + " ");
            }
            System.out.println();
        }
    }
}
