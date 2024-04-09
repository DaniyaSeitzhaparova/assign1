package org.example;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length()-1;
        if(checkString(s,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    /**
     * checking whether “s” is all consists of digits
     * @param s string
     * @param n length of string
     * @return returns answer
     */
    public static boolean checkString(String s,int n){
        if(n==0){
            return Character.isDigit(s.charAt(0));
        }
        else{
            return Character.isDigit(s.charAt(n))&&checkString(s,n-1);
        }
    }
}
