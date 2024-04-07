package org.example;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(calculateFactorial(n));
    }

    /**
     * Calculates the factorial of a number recursively.
     * @param n The number whose factorial to calculate.
     * @return The factorial of the input number.
     */
    public static int calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return calculateFactorial(n-1) * n;
    }
}
