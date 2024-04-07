package org.example;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return calculateFactorial(n-1) * n;
    }
}
