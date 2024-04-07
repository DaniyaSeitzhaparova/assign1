package org.example;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFibonacci(n));
    }

    public static int calculateFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return calculateFibonacci(n-1) + calculateFibonacci(n - 2);
    }
}
