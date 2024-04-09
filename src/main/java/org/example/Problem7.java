package org.example;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int first = 0;
        int last = arr.length - 1;
        reverseArray(arr, first, last);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     *  returns given array in reverse order without using array data structure.
     * @param arr array
     * @param first first element of array
     * @param last last element of array
     */
    public static void reverseArray(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        reverseArray(arr, first + 1, last - 1);
    }
}
