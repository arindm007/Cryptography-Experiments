// Extended Eucledian Algorithm

import java.util.Scanner;

public class Exp7_ExtendedEucledian {
      /*
         * s1=1,s2=0,s=0
         * t1=0,t2=1,t=0
         * r,q=0
         * r1,r2 input
         */

         public static void extEucledian(int a , int b){
            int r1=a;int r2=b;

            int t=0,t1=0,t2=1;
            int s=0,s1=1,s2=0;
            int q,r;

            while (r2>0) {
            q=r1/r2;

            r=r1 - q * r2;
            r1=r2;
            r2=r;

            s=s1 - q * s2;
            s1=s2;
            s2=s;

            t=t1 - q * t2;
            t1=t2;
            t2=t;                
            }

            t=t1;
            s=s1;

            System.out.println("GCD is equal to: "+r1);
            System.out.println("S is equal to: "+s);
            System.out.println("T is equal to: "+t);
            
         }
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        extEucledian(a, b);


    }
    
}
