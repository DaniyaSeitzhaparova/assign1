package org.example;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(calculateGCD(a, b));
    }

    /**
     * Calculates the GCD of two numbers using the Euclidean Algorithm.
     * @param a The first number
     * @param b The second number
     * @return The GCD of a and b
     */
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }
}
