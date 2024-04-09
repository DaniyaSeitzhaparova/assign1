package org.example;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(binomialCoefficient(k,n));
    }

    public static int binomialCoefficient(int k,int n){
        if (k==0||k==n){
            return 1;
        }
        if (n==0||n==1){
            return 1;
        }
        else{
            return binomialCoefficient(k-1,n-1)+binomialCoefficient(k,n-1);
        }
    }
}
