package org.example;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    public static String isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }

        return "Prime";
    }
}
