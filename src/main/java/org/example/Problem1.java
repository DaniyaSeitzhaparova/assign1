package org.example;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(MinimumElement(n, arr));
    }

    /**
     * Finds the minimum element in an array of integers.
     * @param n The number of elements in the array.
     * @param arr The array of integers.
     * @return The minimum element in the array.
     */
   public static int MinimumElement(int n, int[] arr) {
        int minElem = arr[0];

       for (int i = 0; i < n; i++) {
           if (arr[i] < minElem) {
               minElem = arr[i];
           }
       }
       return minElem;
   }
}
