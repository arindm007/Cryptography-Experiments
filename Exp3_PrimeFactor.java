// To find All the prime factor of a number
/* 
----Logic-------
 1) While n is divisible by 2, print 2 and divide n by 2.
2) After step 1, n must be odd. Now start a loop from i = 3 to the square root of n. While i divides n, print i, and divide n by i. After i fails to divide n, increment i by 2 and continue.
3) If n is a prime number and is greater than 2, then n will not become 1 by the above two steps. So print n if it is greater than 2.
 */
import java.util.Scanner;

public class Exp3_PrimeFactor {

    public static void isPrime(int n){
        while (n%2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i < Math.sqrt(n); i+=2) {
            while (n%i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n>2) {
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find the prime factor: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isPrime(a);
    }
}
