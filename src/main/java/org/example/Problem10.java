package org.example;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(calculateGCD(a, b));
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }
}
