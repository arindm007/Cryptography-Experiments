// Find the multiplicative Inverse using Eucledina

import java.util.Scanner;

public class Exp9 {

    public static void mulInv(int a, int b){
            int r1=a;int r2=b;
            int t=0,t1=0,t2=1;
            int q,r;        
        while(r2>0){
            q=r1/r2;

            r = r1 - q * r2;
            r1=r2;
            r2=r;

            t = t1 - q * t2;
            t1=t2;
            t2=t;

            if(t1<0){
                t1=t1+a;
            }

        }

        t=t1;
        System.out.println("GCD is equal to: "+r1);
        System.out.println("Multiplicative Inverse is equal to: "+t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Modulus: ");
        int a=sc.nextInt();

        System.out.println("Enter the Number for which inverse need to be Calculated: ");
        int b=sc.nextInt();
        mulInv(a, b);
        
    }
}
