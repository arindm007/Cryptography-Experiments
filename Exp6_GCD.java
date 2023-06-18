// Eucledian Algorithm to find GCD

import java.util.Scanner;

/**
 * Exp6
 */
public class Exp6_GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } 
        else {
            return gcd(b, a % b);
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two Number to Calculate the GCD: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(gcd(n,m));
    }
}