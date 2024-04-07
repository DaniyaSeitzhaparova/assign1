package org.example;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(averageOfElems(n, arr));
    }

    /**
     * Calculates the average of elements in an array of integers.
     * @param n The number of elements in the array.
     * @param arr The array of integers.
     * @return The average of elements in the array.
     */
    public static double averageOfElems(int n, int[] arr) {
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum/n;
    }
}
