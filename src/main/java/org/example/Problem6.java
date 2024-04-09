package org.example;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(calculatePower(a, n));
    }

    /**
     * Calculates the value of a in the power of n.
     * @param n The number to raise to a power of.
     * @param a The base number.
     * @return The value of a in the power of n.
     */
    public static int calculatePower(int a, int n) {
        if (n == 0) {
           return 1;
        }
        else if (n == 1) {
            return a;
        }
        else {
            return a * calculatePower(a, n-1);
        }
    }
}
